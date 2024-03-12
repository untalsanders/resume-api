package io.github.untalsanders.resume.experience.application.service;

import io.github.untalsanders.resume.experience.domain.Experience;
import io.github.untalsanders.resume.experience.domain.repository.ExperienceRepository;
import io.github.untalsanders.resume.experience.domain.service.ExperienceCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService implements ExperienceCrudService {
    private final ExperienceRepository experienceRepository;

    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    @Override
    public List<Experience> getAll() {
        return experienceRepository.getAll();
    }

    @Override
    public Experience getById(Long experienceId) {
        return null;
    }

    @Override
    public Experience save(Experience experience) {
        return null;
    }

    @Override
    public Experience update(Experience experience) {
        return null;
    }

    @Override
    public void delete(Long experienceId) {

    }
}
