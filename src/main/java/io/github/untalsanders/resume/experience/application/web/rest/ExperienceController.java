package io.github.untalsanders.resume.experience.application.web.rest;

import io.github.untalsanders.resume.experience.application.service.ExperienceService;
import io.github.untalsanders.resume.experience.domain.Experience;
import io.github.untalsanders.resume.experience.domain.service.ExperienceCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    private final ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping
    public ResponseEntity<List<Experience>> getAll() {
        return new ResponseEntity<>(experienceService.getAll(), HttpStatus.OK);
    }
}
