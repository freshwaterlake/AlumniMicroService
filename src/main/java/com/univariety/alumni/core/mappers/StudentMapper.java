package com.univariety.alumni.core.mappers;

import com.univariety.alumni.domain.aggregate.Student;
import org.mapstruct.AfterMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED)
public interface StudentMapper {

    void toStudentEntity(Student studentIn, @MappingTarget Student student);

    @AfterMapping
    default void afterMapping(Student student, @MappingTarget Student studentOut) {
        studentOut.getStudentCollege().setStudent(student);
        studentOut.getStudentSchool().setStudent(student);
        studentOut.getStudentCollege().setStudent(student);
        studentOut.getStudentAppliedColleges().forEach(college -> college.setStudent(student));
        studentOut.getStudentJob().setStudent(student);
        studentOut.getStudentJobHistory().forEach(job -> job.setStudent(student));
    }
}
