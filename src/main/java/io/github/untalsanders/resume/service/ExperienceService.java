package io.github.untalsanders.resume.service;

import io.github.untalsanders.resume.model.Experience;
import io.github.untalsanders.resume.repository.ExperienceRepository;
import io.github.untalsanders.resume.usecase.RetrieveExperienceUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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
