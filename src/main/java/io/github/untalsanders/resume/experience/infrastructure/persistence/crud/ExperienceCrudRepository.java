package io.github.untalsanders.resume.experience.infrastructure.persistence.crud;

import io.github.untalsanders.resume.experience.infrastructure.persistence.entity.ExperienceEntity;
import org.springframework.data.repository.CrudRepository;

public interface ExperienceCrudRepository extends CrudRepository<ExperienceEntity, Long> {}
