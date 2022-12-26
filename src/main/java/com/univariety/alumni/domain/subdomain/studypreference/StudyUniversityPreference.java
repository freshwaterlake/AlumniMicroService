package com.univariety.alumni.domain.subdomain.studypreference;

import com.univariety.alumni.core.AbstractStudyPreferenceEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudyUniversityPreference extends AbstractStudyPreferenceEntity {

    private String universityCode;
    private String preferenceCode;
}
