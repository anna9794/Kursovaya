package hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.model.TipIgrushek;
import hello.TipIgrushekController;

/**
 * Created by Анютка on 13.05.2017.
 */
@Controller
@RequestMapping("/demo")
public class TipIgrushekController {
    @Autowired
    private TipIgrushekRepository tipIgrushekRepository;

    @RequestMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestParam int tip_igrushki, @RequestParam int n_tipa) {
        TipIgrushek n = new TipIgrushek();
        n.setTip_igrushki(tip_igrushki);
        n.setN_tipa(n_tipa);
        tipIgrushekRepository.save(n);
        return "Saved";
    }
//    @RequestMapping("/all")
//    public @ResponseBody Iterable<TipIgrushek> getAllTipIgrushek() {
//
//        return TipIgrushekRepository.findAll();
//    }
}