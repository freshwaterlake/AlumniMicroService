package com.univariety.alumni;

import com.univariety.alumni.domain.Address;
import com.univariety.alumni.domain.BasicProfile;
import com.univariety.alumni.domain.ProfileInfo;
import com.univariety.alumni.service.ProfileInfoService;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserApplicationTests {

    @Autowired
    ProfileInfoService service;

    @Test
    void createProfile() {
        ProfileInfo profileInfo = service.createProfile("MANUAL");
        System.out.println("profileInfo = " + profileInfo.toString());
    }

    @Test
    void createProfileWithBasicInfo() {
        ProfileInfo profileInfo = service.createProfile("MANUAL");
        Address address = new Address("Central London", "Boston Creek", "LONDON", "UK", "123456");
        BasicProfile basicProfile = new BasicProfile("John", "Doe", "MALE", "john.doe@gmail.com",
            "1234567890", true, "My Headline", "STUDENT", address);
        profileInfo = service.save(profileInfo.getId(), basicProfile);
        System.out.println("BasicProfile = " + basicProfile.toString());
    }

    @Test
    void updateBasicProfile() {
        UUID profileId = UUID.fromString("fd3c4882-6fe4-4596-8689-aa3a82d99d73");
        BasicProfile basicProfile = new BasicProfile("Jane", "Doe", "MALE", "jane.doe@gmail.com",
            "1234567890", true, "My Headline", "STUDENT", null);
        ProfileInfo profileInfo = service.updateBasicProfile(profileId, basicProfile);
        System.out.println("ProfileInfo = " + profileInfo.toString());
    }
}
