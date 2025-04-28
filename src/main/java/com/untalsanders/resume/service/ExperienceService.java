package com.untalsanders.resume.service;

import com.untalsanders.resume.model.Experience;
import com.untalsanders.resume.repository.ExperienceRepository;
import com.untalsanders.resume.usecase.RetrieveExperienceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class ExperienceService implements RetrieveExperienceUseCase {

    private final ExperienceRepository experienceRepository;

    @Override
    public Optional<Experience> getExperienceById(Long id) {
        return experienceRepository.findById(id);
    }

    @Override
    public List<Experience> getExperiences() {
        return (List<Experience>) experienceRepository.findAll();
    }
}
