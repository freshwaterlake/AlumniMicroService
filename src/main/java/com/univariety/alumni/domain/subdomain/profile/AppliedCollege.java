package com.univariety.alumni.domain.subdomain.profile;

import com.univariety.alumni.core.AbstractProfileInfoBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AppliedCollege extends AbstractProfileInfoBaseEntity {

    private String collegeCode;
    private String fieldOfStudyCode;
    private String applicationStatusCode;
}
