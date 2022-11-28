package com.univariety.alumni.domain;

import com.univariety.alumni.core.AbstractBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AppliedCollege extends AbstractBaseEntity {

    private String collegeCode;
    private String fieldOfStudyCode;
    private String applicationStatusCode;
}
