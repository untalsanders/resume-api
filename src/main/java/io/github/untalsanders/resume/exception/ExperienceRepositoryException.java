package io.github.untalsanders.resume.exception;

/**
 * This class represents a custom unchecked exception that is thrown
 * to indicate errors or exceptional situations related to the experience
 * repository operations.
 * <p>
 * It extends from RuntimeException, allowing it to be used for cases where
 * user-defined runtime exceptions are needed, typically in cases of errors
 * during data access or manipulation in the experience repository.
 */
public class ExperienceRepositoryException extends RuntimeException {
    public ExperienceRepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
