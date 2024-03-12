package io.github.untalsanders.resume.experience.infrastructure.persistence.util;

import io.github.untalsanders.resume.experience.infrastructure.persistence.crud.ExperienceCrudRepository;
import io.github.untalsanders.resume.experience.infrastructure.persistence.entity.ExperienceEntity;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PopulateExperience implements InitializingBean {

    private final ExperienceCrudRepository experienceCrudRepository;

    public PopulateExperience(ExperienceCrudRepository experienceCrudRepository) {
        this.experienceCrudRepository = experienceCrudRepository;
    }

    @Override
    public void afterPropertiesSet() {
        var e1 = new ExperienceEntity();
        e1.setId(1L);
        e1.setTitle("Experience #1");
        e1.setCompany("Company #1");
        e1.setDescription("Description for experience #1");
        e1.setStartDate(LocalDate.of(2020,1,21));
        e1.setEndDate(LocalDate.of(2020,3, 19));

        var e2 = new ExperienceEntity();
        e2.setId(2L);
        e2.setTitle("Experience #2");
        e2.setCompany("Company #2");
        e2.setDescription("Description for experience #2");
        e2.setStartDate(LocalDate.of(2022,2,12));
        e2.setEndDate(LocalDate.of(2022,8, 26));

        experienceCrudRepository.save(e1);
        experienceCrudRepository.save(e2);
    }
}

