package myspring.notes.sfgdi.controllers;

import myspring.notes.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;
// telling to spring controller isterio type
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        //System.out.println("Hello World");
        return greetingService.sayGreeting();
    }
}
