package com.mybatis3.services;

import com.mybatis3.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/8 17:45
 * Desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class StudentServiceImpleTest {

    private final static Logger logger = LoggerFactory.getLogger(StudentServiceImpleTest.class);

    @Autowired
    private StudentServiceImple studentService;

    @Test
    public void testCreateStudent() {

        long ts = System.currentTimeMillis();
        Student stud = new Student();
        stud.setName("stud_" + ts);
        stud.setEmail("stud_" + ts + "@gmail.com");
        stud.setDob(new Date());
        Student student = studentService.createStudent(stud);
        logger.info("CreatedStudent: " + student);
    }

}
