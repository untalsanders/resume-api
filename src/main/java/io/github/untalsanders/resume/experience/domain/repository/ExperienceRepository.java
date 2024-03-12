package io.github.untalsanders.resume.experience.domain.repository;

import io.github.untalsanders.resume.experience.domain.Experience;

import java.util.List;
import java.util.Optional;

public interface ExperienceRepository {
    List<Experience> getAll();
    Optional<Experience> getById(Long experienceId);
    Optional<Experience> save(Experience experience);
    Optional<Experience> update(Experience experience);
    void delete(Long experienceId);
}
