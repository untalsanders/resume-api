package io.github.untalsanders.resume.experience.infrastructure.persistence.mapper;

import io.github.untalsanders.resume.experience.domain.Experience;
import io.github.untalsanders.resume.experience.infrastructure.persistence.entity.ExperienceEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExperienceMapper {
    @Mappings({
        @Mapping(source = "id", target = "id"),
        @Mapping(source = "title", target = "title"),
        @Mapping(source = "company", target = "company"),
        @Mapping(source = "startDate", target = "startDate"),
        @Mapping(source = "endDate", target = "endDate"),
    })
    Experience entityToDomain(Experience experience);

    List<Experience> toExperiences(List<ExperienceEntity> experienceEntities);

    @InheritInverseConfiguration
    ExperienceEntity domainToEntity(Experience experience);
}
