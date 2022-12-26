package com.univariety.alumni.service;

import com.univariety.alumni.domain.aggregate.StudyPreference;
import com.univariety.alumni.repository.StudyPreferenceRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyPreferenceService {

    @Autowired
    StudyPreferenceRepository repository;

    public StudyPreference getById(UUID profileId) {
        return repository.getReferenceById(profileId);
    }

//    public StudyPreference save(UUID profileId, StudyPreference studyPreference) {
//        final EntityMapper mapper = Mappers.getMapper(EntityMapper.class);
//        StudyPreference studyPreferenceEntity = repository.getReferenceById(profileId);
//        mapper.toEntity(studyPreference, studyPreferenceEntity);
//        return repository.save(studyPreferenceEntity);
//    }
}
