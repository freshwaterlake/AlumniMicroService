package com.univariety.alumni.domain;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Marks {

    private Integer marks;
    private Integer points;
    private String AStarGrade;
    private String AGrade;
    private String BGrade;
    private String CGrade;
    private String DGrade;
    private String EGrade;
}
