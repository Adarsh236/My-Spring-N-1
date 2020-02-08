package myspring.notes.sfgdi.controllers;

import myspring.notes.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//clean code
class ConstructionInjectedControllerTest {

    ConstructionInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructionInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}