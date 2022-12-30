package com.univariety.alumni.domain.subdomain.profile;

import com.univariety.alumni.core.base.AbstractStudentBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudentCollege extends AbstractStudentBaseEntity {

    private String collegeCode;
    private String fieldOfStudyCode;
    private Number startMonth;
    private Number startYear;
    private Number completionMonth;
    private Number completionYear;

}
