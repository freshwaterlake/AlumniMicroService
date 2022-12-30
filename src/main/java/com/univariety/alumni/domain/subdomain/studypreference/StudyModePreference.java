package com.univariety.alumni.domain.subdomain.studypreference;

import com.univariety.alumni.core.base.AbstractStudyPreferenceBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudyModePreference extends AbstractStudyPreferenceBaseEntity {

    private String studyModeCode;
}
