package io.github.untalsanders.resume.domain.repository;

import io.github.untalsanders.resume.domain.model.Experience;

import java.util.Collection;
import java.util.Optional;

public interface ExperienceRepository {
    /**
     * Retrieve <code>Experience</code>s from the data store, returning all experiences
     *
     * @return a <code>Collection</code> of <code>Experience</code>s (or an empty <code>Collection</code> if none
     * found)
     */
    Collection<Experience> findAll();
    Optional<Experience> getById(Long experienceId);
    Optional<Experience> save(Experience experience);
    Optional<Experience> update(Experience experience);

    /**
     * Delete an <code>Experience</code> to the data store by <code>Experience</code>.
     *
     * @param experience the <code>Experience</code> to delete
     *
     */
    void delete(Experience experience);
    void delete(Long experienceId);
}
