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
public class StudentSchool extends AbstractStudentBaseEntity {

    private String schoolCode;
    private String curriculumCode;
    private String classCode;
    private Integer startMonth;
    private Integer startYear;
    private Integer completionMonth;
    private Integer completionYear;
    private StudentMarks studentMarks;
}
