package io.github.untalsanders.resume.domain.usecase;

import io.github.untalsanders.resume.domain.exception.ExperienceNotFoundException;
import io.github.untalsanders.resume.domain.model.Experience;

import java.util.Collection;
import java.util.Optional;

public interface RetrieveExperienceUseCase {
    /**
     * Retrieve a <code>Experience</code> by id.
     *
     * @param id the id to search for
     * @return the <code>Experience</code> if found
     */
    Optional<Experience> getExperience(Long id) throws ExperienceNotFoundException;

    /**
     * Retrieve all <code>Experience</code>s.
     *
     * @return <code>Collection</code> of <code>Experience</code>s
     */
    Collection<Experience> getExperiences();
}
