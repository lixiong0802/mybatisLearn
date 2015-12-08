package com.mybatis3.services;

import com.mybatis3.domain.Student;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;

public class StudentServiceTest {

    private final static Logger logger = LoggerFactory.getLogger(StudentServiceTest.class);

    private static StudentService studentService;

    @BeforeClass
    public static void setup() {
        studentService = new StudentService();
    }

    @AfterClass
    public static void teardown() {
        studentService = null;
    }

    @Test
    public void testFindAllStudents() {
        List<Student> students = studentService.findAllStudents();
        Assert.assertNotNull(students);
        for (Student student : students) {
            logger.info("findAllStudents:" + student);
        }
    }

    @Test
    public void testFindStudentById() {
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        logger.info("findAllStudents:" + student);
    }

    @Test
    public void testCreateStudent() {
        Student student = new Student();
        int id = 5;
//        student.setStudId(id);
        student.setName("student_" + id);
        student.setEmail("student_" + id + "gmail.com");
        student.setDob(new Date());
        studentService.createStudent(student);
        Student newStudent = studentService.findStudentById(id);
        Assert.assertNotNull(newStudent);
    }

    @Test
    public void testUpdateStudent() {

        Student student = new Student();
        int id = 5;
        student.setStudId(id);
        student.setName("lixiong_" + id);
        student.setEmail("lixiong_" + id + "gmail.com");
        student.setDob(new Date());

        studentService.updateStudent(student);

    }

    @Test
    public void testDeleteStudent() {

        int id = 12;
        studentService.deleteStudent(id);

    }

}