package io.github.untalsanders.resume.exception;

/**
 * A class that extends <code>RuntimeException</code> to customize the error
 * message when a <code>Experience</code> not is found.
 *
 * @author Sanders Gutiérrez
 */
public class ExperienceNotFoundException extends Exception {
    public ExperienceNotFoundException(String message) {
        super(message);
    }
}
