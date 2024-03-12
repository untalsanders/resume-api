package io.github.untalsanders.resume.greeter.application.web;

import io.github.untalsanders.resume.greeter.domain.service.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreeterController {
    private final GreeterService service;

    @Autowired
    public GreeterController(GreeterService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<String> greet(@RequestParam(name="name", defaultValue="World") String name) {
        return new ResponseEntity<>(service.greet(name), HttpStatus.OK);
    }
}
