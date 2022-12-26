package com.univariety.alumni.domain.subdomain.profile;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentBasicInfo {

    private String firstName;
    private String lastName;
    private String genderCode;
    private String emailId;
    private String mobileCountryCode;
    private String mobileNumber;
    private Integer passOutYear;
    private Boolean didYouTakeGapAfter12Th;
    private String educationalOrEmploymentStatusCode;
    private String residingCountryCode;
    private String residingCityCode;
    private String professionalHeadline;
}
