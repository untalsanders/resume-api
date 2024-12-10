package io.github.untalsanders.resume.infrastructure.persistence.repository;

import io.github.untalsanders.resume.infrastructure.persistence.entity.ExperienceEntity;
import org.springframework.data.repository.CrudRepository;

public interface ExperienceCrudRepository extends CrudRepository<ExperienceEntity, Long> {}
