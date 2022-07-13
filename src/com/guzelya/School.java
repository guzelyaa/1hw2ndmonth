package com.guzelya;

public class School {
    private String schoolName;
    private int grade;

    public School(String schoolName, int grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getGrade() {
        return grade;
    }
}
