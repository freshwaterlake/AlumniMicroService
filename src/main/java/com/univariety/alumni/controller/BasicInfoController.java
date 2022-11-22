package com.univariety.alumni.controller;

import com.univariety.alumni.domain.BasicInfo;
import com.univariety.alumni.repository.BasicInfoRepository;
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
public class BasicInfoController {

    @Autowired
    BasicInfoRepository repository;

    @GetMapping("/{id}/basicInfo")
    public ResponseEntity<BasicInfo> getByAlumniId(@PathVariable("id") Long alumniId) {
        return new ResponseEntity<BasicInfo>(repository.findByAlumniId(alumniId),
            HttpStatus.OK);
    }

    @PutMapping("/{id}/basicInfo")
    public ResponseEntity<BasicInfo> save(@RequestBody BasicInfo basicInfo) {
        return new ResponseEntity<BasicInfo>(repository.save(basicInfo), HttpStatus.OK);
    }
}
