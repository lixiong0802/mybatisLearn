package com.mybatis3.mappers;

import com.mybatis3.domain.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/6 13:46
 * Desc:
 */
public interface StudentMapper {

    List<Student> findAllStudents();

    Student findStudentById(Integer id);

    void insertStudent(Student student);
}
