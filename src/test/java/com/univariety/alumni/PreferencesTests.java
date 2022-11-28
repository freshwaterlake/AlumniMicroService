package com.univariety.alumni;

import com.univariety.alumni.domain.aggregate.Preferences;
import com.univariety.alumni.domain.subdomain.preference.Skill;
import com.univariety.alumni.service.PreferencesService;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PreferencesTests {

    @Autowired
    PreferencesService service;

    @Test
    void createPreference() {
        Preferences preferences = service.createProfile();
        System.out.println("Preferences = " + preferences.toString());
    }

    @Test
    void addNewSkill() {
        UUID preferenceId = UUID.fromString("e823e2e2-05b0-4fd6-baf7-585293708434");
        Preferences preferences = service.addSkill(preferenceId, new Skill("PROGRAMMING", "INTERMEDIATE"));
        System.out.println("Preferences = " + preferences.toString());
    }

    @Test
    void updateExistingSkill() {
        UUID preferenceId = UUID.fromString("e823e2e2-05b0-4fd6-baf7-585293708434");
        Skill skill = new Skill("PROGRAMMING-ONE", "INTERMEDIATE-ONE");
        skill.setId(2L);
        Preferences preferences = service.addSkill(preferenceId, skill);
        System.out.println("Preferences = " + preferences.toString());
    }
}
