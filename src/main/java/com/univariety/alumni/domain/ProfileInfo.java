package com.univariety.alumni.domain;

import com.univariety.alumni.core.AbstractAggregateRootEntity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
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
public class ProfileInfo extends AbstractAggregateRootEntity {

    private Long parentId;
    private String sourceCode;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "profileInfo")
    private BasicProfile basicProfile;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "profileInfo")
    private School school;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profileInfo")
    private Set<AppliedCollege> appliedColleges = new HashSet<>();

    public ProfileInfo(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public ProfileInfo addBasicInfo(BasicProfile basicProfile) {
        this.basicProfile = basicProfile;
        this.basicProfile.setProfileInfo(this);
        return this;
    }

    public ProfileInfo addSchool(School school) {
        this.school = school;
        this.school.setProfileInfo(this);
        return this;
    }
}
