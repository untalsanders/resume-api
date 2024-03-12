package io.github.untalsanders.resume.experience.domain.service;

import io.github.untalsanders.resume.experience.domain.Experience;

import java.util.List;

public interface ExperienceCrudService {
    List<Experience> getAll();
    Experience getById(Long experienceId);
    Experience save(Experience experience);
    Experience update(Experience experience);
    void delete(Long experienceId);
}
