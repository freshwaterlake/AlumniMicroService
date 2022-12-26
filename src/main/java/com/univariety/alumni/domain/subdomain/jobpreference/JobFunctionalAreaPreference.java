package com.univariety.alumni.domain.subdomain.jobpreference;

import com.univariety.alumni.core.AbstractJobPreferenceBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobFunctionalAreaPreference extends AbstractJobPreferenceBaseEntity {

    private String functionalAreaCode;
    private String preferenceCode;
}
