package com.mybatis3.domain;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/6 13:46
 * Desc:
 */
public class Student {

    private Integer studId;
    private String name;
    private String email;
    private Date dob;

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
