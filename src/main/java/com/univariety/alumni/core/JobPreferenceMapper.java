package com.univariety.alumni.core;

import com.univariety.alumni.domain.aggregate.JobPreference;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED)
public interface JobPreferenceMapper {

    void toJobPreferenceEntity(JobPreference jobPreferenceIn,
        @MappingTarget JobPreference jobPreferenceOut);

    @AfterMapping
    default void afterMapping(JobPreference jobPreference,
        @MappingTarget JobPreference jobPreferenceOut) {
        jobPreference.getJobCompanyPreferences()
            .forEach(jobCompanyPreference -> jobCompanyPreference.setJobPreference(jobPreference));

        jobPreference.getJobIndustryPreferences().forEach(
            jobIndustryPreference -> jobIndustryPreference.setJobPreference(jobPreference));

        jobPreference.getJobFunctionalAreaPreferences().forEach(
            jobFunctionalAreaPreference -> jobFunctionalAreaPreference.setJobPreference(
                jobPreference));

        jobPreference.getJobLocationPreferences().forEach(
            jobLocationPreference -> jobLocationPreference.setJobPreference(jobPreference));
    }
}
