package com.univariety.alumni.jnuit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.univariety.alumni.domain.aggregate.Preferences;
import com.univariety.alumni.domain.subdomain.preference.Skill;
import com.univariety.alumni.service.PreferencesService;
import java.util.Set;
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
        // UUID preferenceId = UUID.fromString("a977e35f-82a2-421e-89e2-eb978cebfa0a");
        Preferences preferences = service.createProfile();
        preferences = service.addSkills(preferences.getId(),
            Set.of(new Skill("PROGRAMMING", "INTERMEDIATE")));
        System.out.println("Preferences = " + preferences.toString());
    }

    @Test
    void updateExistingSkill() {
        // Create a new record with a skill
        Preferences preferences = service.createProfile();
        preferences = service.addSkills(preferences.getId(),
            Set.of(new Skill("PROGRAMMING", "INTERMEDIATE")));

        // Update the skill
        Skill skill = preferences.getSkills().iterator().next();
        skill.setSkillCode("PROGRAMMING-UPDATED");
        skill.setSkillLevelCode("INTERMEDIATE-UPDATED");

        preferences = service.addSkills(preferences.getId(), Set.of(skill));
        assertThat(preferences.getSkills().size(), equalTo(1));
        assertThat(preferences.getSkills().iterator().next().getSkillCode(), equalTo("PROGRAMMING-UPDATED"));
    }

    @Test
    void getById() {
        // Create User
        Preferences preferences = service.createProfile();

        // Add Skills
        Skill skillOne = new Skill("PROGRAMMING", "INTERMEDIATE");
        Skill skillTwo = new Skill("MATHS", "BASIC");
        preferences = service.addSkills(preferences.getId(), Set.of(skillOne, skillTwo));

        // Check whether retrieved has two skills
        Preferences storedPreferences = service.getById(preferences.getId());
        System.out.println("Stored Preferences = " + storedPreferences.toString());
        assertThat(storedPreferences.getSkills().size(), equalTo(2));
    }

}
