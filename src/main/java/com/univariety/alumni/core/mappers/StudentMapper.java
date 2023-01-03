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
        if (studentOut.getStudentCollege() != null) {
            studentOut.getStudentCollege().setStudent(student);
        }
        if (studentOut.getStudentSchool() != null) {
            studentOut.getStudentSchool().setStudent(student);
        }
        if (studentOut.getStudentCollege() != null) {
            studentOut.getStudentCollege().setStudent(student);
        }
        studentOut.getStudentAppliedColleges().forEach(college -> college.setStudent(student));
        if (studentOut.getStudentJob() != null) {
            studentOut.getStudentJob().setStudent(student);
        }
        studentOut.getStudentJobHistory().forEach(job -> job.setStudent(student));
    }
}
