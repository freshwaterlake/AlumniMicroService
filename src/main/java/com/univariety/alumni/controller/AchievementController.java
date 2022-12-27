package com.univariety.alumni.controller;

import com.univariety.alumni.domain.aggregate.Achievement;
import com.univariety.alumni.service.AchievementService;
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
@RequestMapping("api/{id}/achievement")
public class AchievementController {

    @Autowired
    AchievementService service;

    @GetMapping
    public ResponseEntity<Achievement> findById(@PathVariable("id") String id) {
        return new ResponseEntity<>(service.getById(UUID.fromString(id)), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Achievement> save(@PathVariable("id") String profileId,
        @RequestBody Achievement achievement) {
        return new ResponseEntity<>(service.save(UUID.fromString(profileId), achievement),
            HttpStatus.OK);
    }
}
