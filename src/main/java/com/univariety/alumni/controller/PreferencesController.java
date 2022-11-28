package com.univariety.alumni.controller;

import com.univariety.alumni.domain.aggregate.Preferences;
import com.univariety.alumni.service.PreferencesService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/preferences")
public class PreferencesController {

    @Autowired
    PreferencesService service;

    @GetMapping("/{id}")
    public ResponseEntity<Preferences> findById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Preferences> save(@PathVariable("id") UUID profileId,
        @RequestBody Preferences preferences) {
        return new ResponseEntity<>(service.save(profileId, preferences), HttpStatus.OK);
    }
}
