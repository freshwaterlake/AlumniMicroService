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
public class StudentJob extends AbstractStudentBaseEntity {

    private String designationCode;
    private String companyCode;
    private Integer startMonth;
    private Integer startYear;
    private Integer endMonth;
    private Integer endYear;
    private Boolean isCurrent;
}
