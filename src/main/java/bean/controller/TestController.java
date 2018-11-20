package bean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @Author: yunxiang.yang
 * @Date: 2018/11/20 16:20
 */

@Controller
@RequestMapping("/")
public class TestController {
//    @Autowired
//    private ContactRepository contactRepo;

    @RequestMapping(method = RequestMethod.GET)
    public String home(Map<String, Object> model) {
//        List<Contact> contacts = contactRepo.findAll();
//        model.put("contacts", contacts);
        return "home";
    }
    /*@RequestMapping(method=RequestMethod.POST)
    public String submit(Contact contact) {
        contactRepo.save(contact);
        return "redirect:/";
    }*/

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String test() {
//        List<Contact> contacts = contactRepo.findAll();
//        model.put("contacts", contacts);
        return "home";
    }

}
