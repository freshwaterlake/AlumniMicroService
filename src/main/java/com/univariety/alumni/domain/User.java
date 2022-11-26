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
public class User extends AbstractBaseEntity {

    private Long parentId;
    private String sourceCode;
}
