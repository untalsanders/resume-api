package com.sandersgutierrez.resume.application.web;

import com.sandersgutierrez.resume.domain.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    private final GreetingService service;

    @Autowired
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/greeting")
    public @ResponseBody String greeting(@RequestParam(name="name", defaultValue="World") String name) {
        return service.greet(name);
    }
}
