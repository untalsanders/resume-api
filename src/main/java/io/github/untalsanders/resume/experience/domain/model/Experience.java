package io.github.untalsanders.resume.experience.domain.model;

import java.time.LocalDate;

public final class Experience {
    private Long id;
    private String title;
    private String company;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;

    public Experience() {}

    public Experience(Long id, String title, String company, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Experience{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", company='" + company + '\'' +
            ", startDate=" + startDate +
            ", endDate=" + endDate +
            ", description='" + description + '\'' +
            '}';
    }
}
