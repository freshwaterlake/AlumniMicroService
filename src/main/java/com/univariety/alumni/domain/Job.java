package com.univariety.alumni.domain;

import com.univariety.alumni.core.AbstractBaseEntity;
import java.sql.Date;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Job extends AbstractBaseEntity {

    private String designationCode;
    private String companyCode;
    private Date startDate;
    private Date endDate;
    private Boolean isCurrent;
}
