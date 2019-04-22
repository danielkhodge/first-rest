package com.hodge.daniel.firstrest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/first")
public class FirstRestController {

    static {
        System.out.println("Loaded...");
    }

    @GetMapping("customer-types")
    public String getCustomerTypes(@RequestParam(name = "name", required = true, defaultValue = "Human") String name,
                                   @RequestParam(name = "greeting", required = true, defaultValue = "Sup dude") String greeting) {
        return name + greeting + ": personal, commercial";
    }

    @GetMapping("customer-names")
    public String getCustomerNames(@RequestParam(name = "firstName", required = true, defaultValue = "Daniel") String first,
                                   @RequestParam(name = "lastName", required = true, defaultValue = "Hodge") String last) {
        return first + last + "is my name";
    }
}
