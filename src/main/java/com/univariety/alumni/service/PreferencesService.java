package com.univariety.alumni.service;

import com.univariety.alumni.domain.aggregate.Preferences;
import com.univariety.alumni.domain.subdomain.preference.Skill;
import com.univariety.alumni.repository.PreferencesRepository;
import java.util.Set;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferencesService {

    @Autowired
    PreferencesRepository repository;

    public Preferences getById(UUID profileId) {
        return repository.getReferenceById(profileId);
    }

    public Preferences save(UUID profileId, Preferences preferences) {
        Preferences pref = repository.getReferenceById(profileId);
        pref.setSkills(preferences.getSkills());
        return repository.save(pref);
    }

    public Preferences createProfile() {
        Preferences preferences = new Preferences();
        return repository.save(preferences);
    }

    public Preferences addSkills(UUID preferenceId, Set<Skill> skills) {
        Preferences preferences = repository.getReferenceById(preferenceId);
        preferences.setSkills(skills);
        return repository.save(preferences);
    }
}
