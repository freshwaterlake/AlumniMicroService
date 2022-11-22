package com.univariety.alumni.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class GraduationJourney {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String collegeCode;
    private String fieldOfStudyCode;
    private String startMonthYear;
    private String completionMonthYear;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "graduation_journey_id")
    private Set<AppliedColleges> appliedColleges = new HashSet<>();

    private Long alumniId;
}
