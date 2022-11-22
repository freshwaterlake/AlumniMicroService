package com.univariety.alumni.repository;

import com.univariety.alumni.domain.BasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
    public BasicInfo findByAlumniId(Long alumniId);
}
