package com.univariety.alumni.controller;

import com.univariety.alumni.domain.College;
import com.univariety.alumni.repository.CollegeRepository;
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
@RequestMapping("api/user")
public class CollegeController {

    @Autowired
    CollegeRepository repository;

    @GetMapping("/{id}/gradJourney")
    public ResponseEntity<College> getByAlumniId(@PathVariable("id") UUID userGuid) {
        return new ResponseEntity<>(repository.findByUserGuid(userGuid),
            HttpStatus.OK);
    }

    @PutMapping("/{id}/gradJourney")
    public ResponseEntity<College> save(@RequestBody College gradJourney) {
        return new ResponseEntity<>(repository.save(gradJourney), HttpStatus.OK);
    }
}
