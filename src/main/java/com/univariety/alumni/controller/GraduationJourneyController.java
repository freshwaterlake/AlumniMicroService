package com.univariety.alumni.controller;

import com.univariety.alumni.domain.GraduationJourney;
import com.univariety.alumni.repository.GraduationJourneyRepository;
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
@RequestMapping("api/alumni")
public class GraduationJourneyController {
    @Autowired
    GraduationJourneyRepository repository;

    @GetMapping("/{id}/gradJourney")
    public ResponseEntity<GraduationJourney> getByAlumniId(@PathVariable("id") Long alumniId) {
        return new ResponseEntity<GraduationJourney>(repository.findByAlumniId(alumniId),
            HttpStatus.OK);
    }

    @PutMapping("/{id}/gradJourney")
    public ResponseEntity<GraduationJourney> save(@RequestBody GraduationJourney gradJourney) {
        return new ResponseEntity<GraduationJourney>(repository.save(gradJourney), HttpStatus.OK);
    }
}
