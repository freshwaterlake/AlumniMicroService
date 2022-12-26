package com.univariety.alumni.service;

import com.univariety.alumni.domain.aggregate.Student;
import com.univariety.alumni.repository.StudentRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student getById(UUID profileId) {
        return repository.getReferenceById(profileId);
    }

//    public Student save(UUID profileId, Student student) {
//        final EntityMapper mapper = Mappers.getMapper(EntityMapper.class);
//        Student studentEntity = repository.getReferenceById(profileId);
//        mapper.toEntity(student, studentEntity);
//        return repository.save(studentEntity);
//    }

}
