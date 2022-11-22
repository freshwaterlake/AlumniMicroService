package com.univariety.alumni.domain;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    private String addressLine1;
    private String addressLine2;
    private String cityCode;
    private String countryCode;
    private String pin;
}
