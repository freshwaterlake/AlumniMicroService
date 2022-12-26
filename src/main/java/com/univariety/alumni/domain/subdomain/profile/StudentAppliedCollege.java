package com.univariety.alumni.domain.subdomain.profile;

import com.univariety.alumni.core.AbstractStudentBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudentAppliedCollege extends AbstractStudentBaseEntity {

    private String collegeCode;
    private String fieldOfStudyCode;
    private String applicationStatusCode;
}
