package com.untalsanders.resume.repository.springdatajpa;

import com.untalsanders.resume.repository.ExperienceRepository;
import com.untalsanders.resume.model.Experience;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@Profile("spring-data-jpa")
public interface SpringDataExperienceRepository extends ExperienceRepository, Repository<Experience, Long> {
    @Override
    @Query("SELECT experience FROM Experience experience")
    List<Experience> findAll() throws DataAccessException;

    @Override
    @Query("SELECT experience FROM Experience experience WHERE experience.id = :id")
    Optional<Experience> findById(@Param("id") Long id) throws DataAccessException;
}
