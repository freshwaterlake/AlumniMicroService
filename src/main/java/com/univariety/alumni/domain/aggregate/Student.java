package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.base.AbstractAggregateRootEntity;
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
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@ToString
public class Student extends AbstractAggregateRootEntity {

    private Long parentId;
    private String sourceCode;

    @Embedded
    private StudentBasicInfo studentBasicInfo;

    @Embedded
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
