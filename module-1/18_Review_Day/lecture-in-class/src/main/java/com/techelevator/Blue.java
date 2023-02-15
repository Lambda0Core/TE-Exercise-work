package com.techelevator;

public class Blue {

    private int studentCount;
    private double averageGPA;
    private String classname;

    public Blue(int studentCount, double averageGPA, String classname) {
        this.studentCount = studentCount;
        this.averageGPA = averageGPA;
        this.classname = classname;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public double getAverageGPA() {
        return averageGPA;
    }

    public String getClassname() {
        return classname;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setAverageGPA(double averageGPA) {
        this.averageGPA = averageGPA;
    }
}
