package io.github.untalsanders.resume.application.service;

import io.github.untalsanders.resume.domain.exception.ExperienceNotFoundException;
import io.github.untalsanders.resume.domain.model.Experience;
import io.github.untalsanders.resume.domain.repository.ExperienceRepository;
import io.github.untalsanders.resume.domain.usecase.RetrieveExperienceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService implements RetrieveExperienceUseCase {
    private final ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public Optional<Experience> getExperience(Long id) throws ExperienceNotFoundException {
        return Optional.empty();
    }

    @Override
    public List<Experience> getExperiences() {
        return (List<Experience>) experienceRepository.findAll();
    }
}
