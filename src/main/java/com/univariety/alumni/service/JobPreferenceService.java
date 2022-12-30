package com.univariety.alumni.service;

import com.univariety.alumni.core.mappers.JobPreferenceMapper;
import com.univariety.alumni.domain.aggregate.JobPreference;
import com.univariety.alumni.repository.JobPreferenceRepository;
import java.util.UUID;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobPreferenceService {

    @Autowired
    JobPreferenceRepository repository;

    public JobPreference getById(UUID profileId) {
        return repository.getReferenceById(profileId);
    }

    public JobPreference save(UUID profileId, JobPreference jobPreference) {
        final JobPreferenceMapper mapper = Mappers.getMapper(JobPreferenceMapper.class);
        JobPreference jobPreferenceEntity = repository.getReferenceById(profileId);
        mapper.toJobPreferenceEntity(jobPreference, jobPreferenceEntity);
        return repository.save(jobPreferenceEntity);
    }
}
