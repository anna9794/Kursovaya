package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.model.TipIgrushek;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Анютка on 13.05.2017.
 */
@Controller
@RequestMapping("/demo")
public class TipIgrushekController {
    @Autowired
    private TipIgrushekRepository tipIgrushekRepository;

    @RequestMapping("/list")
    public String tip_igrushki (Model model) {
        model.addAttribute("tip_igrushki", tipIgrushekRepository.findAll());
        return "tip_igrushki";
    }

    @RequestMapping("/add")
    public
    @ResponseBody
    String add(@RequestParam(value = "tipIgrushek", required = true) String name,
               Model model) {
        TipIgrushek n = new TipIgrushek();
        n.setTip_igrushki(name);
        tipIgrushekRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<TipIgrushek> getAllTipIgrushek() {

        return tipIgrushekRepository.findAll();
    }
@RequestMapping(value="/tipIgrushek", method= RequestMethod.GET)
public String greetingForm(Model model) {
    model.addAttribute("tipIgrushek", new TipIgrushek());
    return "tipIgrushek";
}

    @RequestMapping(value="/tipIgrushek", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute TipIgrushek n, Model model) {
        tipIgrushekRepository.save(n);
        model.addAttribute("tipIgrushek", n);
        return "result";
    }

}