package com.untalsanders.resume.rest.controller;

import com.untalsanders.resume.model.Experience;
import com.untalsanders.resume.service.ExperienceService;
import com.untalsanders.resume.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(Constants.ENDPOINT_EXPERIENCE)
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ExperienceController {

    private final ExperienceService experienceService;

    @GetMapping
    public ResponseEntity<List<Experience>> getAllExperiences() {
        return new ResponseEntity<>(experienceService.getExperiences(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Experience>> getExperience(@PathVariable Long id) {
        return new ResponseEntity<>(experienceService.getExperienceById(id), HttpStatus.OK);
    }
}
