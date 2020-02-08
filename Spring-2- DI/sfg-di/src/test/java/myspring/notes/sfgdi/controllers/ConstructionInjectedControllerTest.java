package myspring.notes.sfgdi.controllers;

import myspring.notes.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//clean code
class ConstructionInjectedControllerTest {

    ConstructionInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructionInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}