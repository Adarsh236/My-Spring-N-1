package myspring.notes.sfgdi.controllers;

import myspring.notes.sfgdi.services.ConstructorGreetingService;
import myspring.notes.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//clean code
@Controller
public class ConstructionInjectedController {
    private final GreetingService greetingService;

    //@Autowired - Optional here
    public ConstructionInjectedController(@Qualifier("constructorGreetingService"/*lowwercase for bean name*/) GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
