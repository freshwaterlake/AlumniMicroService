package com.univariety.alumni.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BasicInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String genderCode;
    private String email;
    private String mobile;
    private Boolean isThereGapAfter12;
    private String headline;
    private String presentStatusCode;
    private Integer class12CompletionYear;
    private Address address;
    private Long alumniId;
}
