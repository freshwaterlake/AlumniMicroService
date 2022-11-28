package com.univariety.alumni.domain.subdomain.profile;

import com.univariety.alumni.core.AbstractProfileInfoBaseEntity;
import java.sql.Date;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class School extends AbstractProfileInfoBaseEntity {

    private String schoolCode;
    private String curriculumCode;
    private String classCode;
    private Date startDate;
    private Date completionDate;
    private Marks marks;
}
