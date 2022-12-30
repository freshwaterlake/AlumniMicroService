package com.univariety.alumni.domain.subdomain.jobpreference;

import com.univariety.alumni.core.base.AbstractJobPreferenceBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobIndustryPreference extends AbstractJobPreferenceBaseEntity {

    private String industryCode;
    private String preferenceCode;
}
