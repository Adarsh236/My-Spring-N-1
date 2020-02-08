package myspring.notes.sfgdi.controllers;

import org.springframework.stereotype.Controller;
// telling to spring controller isterio type
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");

        return "Hi Adarsh";
    }
}
