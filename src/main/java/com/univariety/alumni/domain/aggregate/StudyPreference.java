package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.base.AbstractAggregateRootEntity;
import com.univariety.alumni.domain.subdomain.studypreference.StudyFieldPreference;
import com.univariety.alumni.domain.subdomain.studypreference.StudyLocationPreference;
import com.univariety.alumni.domain.subdomain.studypreference.StudyModePreference;
import com.univariety.alumni.domain.subdomain.studypreference.StudyProgramPreference;
import com.univariety.alumni.domain.subdomain.studypreference.StudyUniversityPreference;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "user")
public class StudyPreference extends AbstractAggregateRootEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studyPreference")
    private Set<StudyFieldPreference> studyFieldPreferences = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studyPreference")
    private Set<StudyLocationPreference> studyLocationPreferences = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studyPreference")
    private Set<StudyModePreference> studyModePreferences = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studyPreference")
    private Set<StudyProgramPreference> studyProgramPreferences = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studyPreference")
    private Set<StudyUniversityPreference> studyUniversityPreferences = new HashSet<>();
}
