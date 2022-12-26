package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.AbstractAggregateRootEntity;
import com.univariety.alumni.domain.subdomain.profile.StudentAdditionalInfo;
import com.univariety.alumni.domain.subdomain.profile.StudentAppliedCollege;
import com.univariety.alumni.domain.subdomain.profile.StudentBasicInfo;
import com.univariety.alumni.domain.subdomain.profile.StudentCollege;
import com.univariety.alumni.domain.subdomain.profile.StudentJob;
import com.univariety.alumni.domain.subdomain.profile.StudentJobHistory;
import com.univariety.alumni.domain.subdomain.profile.StudentSchool;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@ToString
public class Student extends AbstractAggregateRootEntity {

    private Long parentId;
    private String sourceCode;
    private StudentBasicInfo studentBasicInfo;
    private StudentAdditionalInfo studentAdditionalInfo;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
    private StudentSchool studentSchool;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
    private StudentCollege studentCollege;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<StudentAppliedCollege> studentAppliedColleges = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
    private StudentJob studentJob;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<StudentJobHistory> studentJobHistory = new HashSet<>();

}
