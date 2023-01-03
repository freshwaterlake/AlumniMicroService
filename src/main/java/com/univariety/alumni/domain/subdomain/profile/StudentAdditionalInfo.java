package com.univariety.alumni.domain.subdomain.profile;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class StudentAdditionalInfo {

    private String addressLine1;
    private String addressLine2;
    private String pinOrZip;
    private String class12CurriculumCode;
    private Integer marks;
    private Integer gpaCode;
    private String gradeAStarCode;
    private String gradeACode;
    private String gradeBCode;
    private String gradeCCode;
    private String gradeDCode;
    private String gradeECode;
}
