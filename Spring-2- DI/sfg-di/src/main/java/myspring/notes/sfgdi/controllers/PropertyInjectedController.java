package myspring.notes.sfgdi.controllers;

import myspring.notes.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // to fix property
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired// tell I want to import greeting services
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
