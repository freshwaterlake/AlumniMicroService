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
public class StudentJob extends AbstractStudentBaseEntity {

    private String designation;
    private String companyName;
    private Integer startMonthCode;
    private Integer startYearCode;
    private Integer endMonthCode;
    private Integer endYearCode;
    private String industryCode;
    private String functionalAreaCode;
}
