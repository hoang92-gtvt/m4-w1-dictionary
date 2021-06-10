package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryService;
import service.IDictionaryService;

@Controller
public class DictionaryController {
    IDictionaryService dictionaryService = new DictionaryService();

    @GetMapping("/find")
    public String pageFind(){
        return "/home";
    }

    @PostMapping("/find")
    public ModelAndView getValue(String key){
        ModelAndView modelAndView= new ModelAndView("/home");
        String result = dictionaryService.getValueByKey(key);
        modelAndView.addObject("result",result);
        modelAndView.addObject("key",key);
        return modelAndView;
    }

    //
//    @GetMapping("/read")
//    public String pageRead(){
//        return "/home2";
//    }
}
