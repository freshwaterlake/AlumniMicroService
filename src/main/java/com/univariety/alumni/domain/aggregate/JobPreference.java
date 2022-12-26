package com.univariety.alumni.domain.aggregate;

import com.univariety.alumni.core.AbstractAggregateRootEntity;
import com.univariety.alumni.domain.subdomain.jobpreference.JobCompanyPreference;
import com.univariety.alumni.domain.subdomain.jobpreference.JobFunctionalAreaPreference;
import com.univariety.alumni.domain.subdomain.jobpreference.JobIndustryPreference;
import com.univariety.alumni.domain.subdomain.jobpreference.JobLocationPreference;
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
public class JobPreference extends AbstractAggregateRootEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobPreference")
    private Set<JobCompanyPreference> jobCompanyPreferences = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobPreference")
    private Set<JobFunctionalAreaPreference> jobFunctionalAreaPreferences = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobPreference")
    private Set<JobIndustryPreference> jobIndustryPreferences = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jobPreference")
    private Set<JobLocationPreference> jobLocationPreferences = new HashSet<>();
}
