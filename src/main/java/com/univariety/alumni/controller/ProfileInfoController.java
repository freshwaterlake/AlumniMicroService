package com.univariety.alumni.controller;

import com.univariety.alumni.domain.aggregate.ProfileInfo;
import com.univariety.alumni.service.ProfileInfoService;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/profileInfo")
public class ProfileInfoController {

    @Autowired
    ProfileInfoService service;

    @GetMapping("/{id}")
    public ResponseEntity<ProfileInfo> findById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<ProfileInfo> save(@PathVariable("id") UUID profileId, @RequestBody ProfileInfo profileInfo) {
//        return new ResponseEntity<>(service.save(profileId, profileInfo), HttpStatus.OK);
//    }
}
