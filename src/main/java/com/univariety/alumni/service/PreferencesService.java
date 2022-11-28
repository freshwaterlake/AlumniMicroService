package com.univariety.alumni.service;

import com.univariety.alumni.domain.Preferences;
import com.univariety.alumni.domain.Skill;
import com.univariety.alumni.repository.PreferencesRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferencesService {

    @Autowired
    PreferencesRepository repository;

    public Preferences createProfile() {
        Preferences preferences = new Preferences();
        return repository.save(preferences);
    }

    public Preferences addSkill(UUID preferenceId, Skill skill) {
        Preferences preferences = repository.getReferenceById(preferenceId);
        preferences.addSkill(skill);
        return repository.save(preferences);
    }
}
