package hello;

import hello.model.TipIgrushek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.model.TipIgrushek;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import hello.Igrushka;
import hello.IgrushkaRepository;

/**
 * Created by Анютка on 13.05.2017.
 */
@Controller
@RequestMapping("/demo")
public class IgrushkaController {
    @Autowired
    private IgrushkaRepository igrushkaRepository;

    @RequestMapping("/list")
    public String nazvanie (Model model) {
        model.addAttribute("nazvanie", igrushkaRepository.findAll());
        return "nazvanie";
    }

    @RequestMapping("/add")
    public
    @ResponseBody
    String add(@RequestParam(value = "igrushka", required = true) String nazvanie,
               Model model) {
        Igrushka n = new Igrushka();
        n.setNazvanie(nazvanie);
        igrushkaRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<Igrushka> getAllIgrushka() {

        return igrushkaRepository.findAll();
    }
    @RequestMapping(value="/igrushka", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("igrushka", new Igrushka());
        return "igrushka";
    }

    @RequestMapping(value="/igrushka", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Igrushka n, Model model) {
        igrushkaRepository.save(n);
        model.addAttribute("igrushka", n);
        return "result";
    }

}