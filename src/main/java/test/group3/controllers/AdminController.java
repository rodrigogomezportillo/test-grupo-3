package test.group3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.group3.entities.User;
import test.group3.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/new/user/save")
    public ResponseEntity<Object> saveUser(@RequestBody User user) {

        int response = userService.saveUser(user);

        if(response == 0){
            return new ResponseEntity<>("usuario guardado con exito", HttpStatus.OK);
        } 
        
        return new ResponseEntity<>("el usuario ya existe", HttpStatus.OK);
    }

    @GetMapping(value = "/new/user")
    public ModelAndView createNewUser() {


       return new ModelAndView("user");

    }
    
    
}
