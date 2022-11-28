package com.univariety.alumni.domain;

import com.univariety.alumni.core.AbstractBaseEntity;
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
public class BasicProfile extends AbstractBaseEntity {

    private String firstName;
    private String lastName;
    private String genderCode;
    private String email;
    private String mobile;
    private Boolean isThereGapAfter12;
    private String headline;
    private String presentStatusCode;
    private Address address;
}
