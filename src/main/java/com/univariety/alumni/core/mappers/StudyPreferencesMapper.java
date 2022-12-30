package com.univariety.alumni.core.mappers;

import com.univariety.alumni.domain.aggregate.StudyPreference;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED)
public interface StudyPreferencesMapper {

    void toStudyPreferenceEntity(StudyPreference studyPreferenceIn, @MappingTarget StudyPreference studyPreference);

    @AfterMapping
    default void afterMapping(StudyPreference studyPreference, @MappingTarget StudyPreference studyPreferenceOut) {
        studyPreferenceOut.getStudyFieldPreferences().forEach(pref -> pref.setStudyPreference(studyPreference));
        studyPreferenceOut.getStudyModePreferences().forEach(model -> model.setStudyPreference(studyPreference));
        studyPreferenceOut.getStudyLocationPreferences().forEach(location -> location.setStudyPreference(studyPreference));
        studyPreferenceOut.getStudyProgramPreferences().forEach((program -> program.setStudyPreference(studyPreference)));
        studyPreferenceOut.getStudyUniversityPreferences().forEach(university -> university.setStudyPreference(studyPreference));
    }
}
