package com.univariety.alumni.repository;

import com.univariety.alumni.domain.GraduationJourney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraduationJourneyRepository extends JpaRepository<GraduationJourney, Long> {
    public GraduationJourney findByAlumniId(Long alumniId);
}
