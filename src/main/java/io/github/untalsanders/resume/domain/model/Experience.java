package io.github.untalsanders.resume.domain.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public final class Experience {
    private Long id;
    private String jobTitle;
    private String company;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;

    public Experience(Long id, String jobTitle, String company, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
