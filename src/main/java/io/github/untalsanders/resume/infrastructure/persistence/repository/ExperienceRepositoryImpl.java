package io.github.untalsanders.resume.infrastructure.persistence.repository;

import io.github.untalsanders.resume.domain.model.Experience;
import io.github.untalsanders.resume.domain.repository.ExperienceRepository;
import io.github.untalsanders.resume.infrastructure.persistence.entity.ExperienceEntity;
import io.github.untalsanders.resume.infrastructure.persistence.mapper.ExperienceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public class ExperienceRepositoryImpl implements ExperienceRepository {
    private final ExperienceCrudRepository experienceCrudRepository;
    private final ExperienceMapper experienceMapper;

    @Autowired
    public ExperienceRepositoryImpl(ExperienceCrudRepository experienceCrudRepository, ExperienceMapper experienceMapper) {
        this.experienceCrudRepository = experienceCrudRepository;
        this.experienceMapper = experienceMapper;
    }

    @Override
    public Collection<Experience> findAll() {
        List<ExperienceEntity> experienceEntityList = (List<ExperienceEntity>) experienceCrudRepository.findAll();
        return experienceMapper.toExperiences(experienceEntityList);
    }

    @Override
    public Optional<Experience> getById(Long experienceId) {
        return Optional.empty();
    }

    @Override
    public Optional<Experience> save(Experience experience) {
        return Optional.empty();
    }

    @Override
    public Optional<Experience> update(Experience experience) {
        return Optional.empty();
    }

    @Override
    public void delete(Experience experience) {

    }

    @Override
    public void delete(Long experienceId) {

    }
}
