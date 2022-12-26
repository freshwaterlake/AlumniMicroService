package com.univariety.alumni.controller;

import com.univariety.alumni.domain.aggregate.JobPreference;
import com.univariety.alumni.service.JobPreferenceService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/job-preference")
public class JobPreferenceController {

    @Autowired
    JobPreferenceService service;

    @GetMapping("/{id}")
    public ResponseEntity<JobPreference> findById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<JobPreference> save(@PathVariable("id") UUID profileId,
//        @RequestBody JobPreference jobPreference) {
//        return new ResponseEntity<>(service.save(profileId, jobPreference), HttpStatus.OK);
//    }
}
