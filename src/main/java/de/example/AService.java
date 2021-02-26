package de.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AService {
    @RequestMapping("/service")
    public String index() {
        return "Hello";
    }

    @RequestMapping("/service/{name}")
    public String greeting(@PathVariable("name") String name) {
        return "Greeting " + name + "!";
    }
}
