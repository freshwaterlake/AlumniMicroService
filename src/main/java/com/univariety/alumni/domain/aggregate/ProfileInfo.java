package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.AbstractAggregateRootEntity;
import com.univariety.alumni.domain.subdomain.profile.AppliedCollege;
import com.univariety.alumni.domain.subdomain.profile.BasicProfile;
import com.univariety.alumni.domain.subdomain.profile.School;
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

    public ProfileInfo setBasicInfo(BasicProfile basicProfile) {
        if (basicProfile == null) {
            return this;
        }

        this.basicProfile = basicProfile;
        this.basicProfile.setProfileInfo(this);
        return this;
    }

    public ProfileInfo setSchool(School school) {
        // Note: Check for null and return
        if (school == null) {
            return this;
        }

        this.school = school;
        this.school.setProfileInfo(this);
        return this;
    }
}
