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
public class StudyModePreference extends AbstractStudyPreferenceEntity {

    private String studyModeCode;
}
