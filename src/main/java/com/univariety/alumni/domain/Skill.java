package com.univariety.alumni.domain;

import com.univariety.alumni.core.AbstractPreferencesBaseEntity;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Skill extends AbstractPreferencesBaseEntity {
    private String skillCode;
    private String skillLevelCode;
}
