package com.univariety.alumni.controller;

import com.univariety.alumni.domain.aggregate.StudyPreference;
import com.univariety.alumni.service.StudyPreferenceService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/study-preferences")
public class StudyPreferenceController {

    @Autowired
    StudyPreferenceService service;

    @GetMapping("/{id}")
    public ResponseEntity<StudyPreference> findById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<StudyPreference> save(@PathVariable("id") UUID profileId,
//        @RequestBody StudyPreference studyPreference) {
//        return new ResponseEntity<>(service.save(profileId, studyPreference), HttpStatus.OK);
//    }
}
