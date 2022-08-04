package test.group3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelo = new ModelAndView("index");

        return modelo;

    }
    
}
