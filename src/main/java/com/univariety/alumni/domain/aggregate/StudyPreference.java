package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.AbstractAggregateRootEntity;
import com.univariety.alumni.domain.subdomain.studypreference.StudyFieldPreference;
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


}
