package com.untalsanders.resume.repository;

import com.untalsanders.resume.model.Experience;

import java.util.Collection;
import java.util.Optional;

/**
 * Interface for managing and accessing <code>Experience</code> objects in a data store.
 * Provides methods to find, save, update, and delete experiences.
 */
public interface ExperienceRepository {
    /**
     * Retrieve all <code>Experience</code>s from the data store.
     *
     * @return a <code>Collection</code> of <code>Experience</code>s
     * (or an empty <code>Collection</code> if none found)
     */
    Collection<Experience> findAll();

    /**
     * Retrieve an <code>Experience</code> from the data store by id.
     *
     * @param id the id of the <code>Experience</code> to search for
     * @return an Optional containing the found Experience if it exists,
     * or an empty Optional if no Experience is found with the given id
     */
    Optional<Experience> findById(Long id);
}
