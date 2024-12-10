package io.github.untalsanders.resume.experience.application.service;

import io.github.untalsanders.resume.experience.domain.exception.ExperienceNotFoundException;
import io.github.untalsanders.resume.experience.domain.model.Experience;
import io.github.untalsanders.resume.experience.domain.repository.ExperienceRepository;
import io.github.untalsanders.resume.experience.domain.usecase.RetrieveExperienceUseCase;
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
