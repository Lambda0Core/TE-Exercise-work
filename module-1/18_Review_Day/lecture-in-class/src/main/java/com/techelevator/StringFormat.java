package com.techelevator;

public class StringFormat {

    public static void main(String[] args) {
        String className = "NLR-12 Java Blue";

        Blue classInfo = new Blue(18, 2.9, "Java Blue");

        System.out.println("Class: " + classInfo.getClassname() +
                           "  #Students: " + classInfo.getStudentCount() +
                            " added another line " +
                           " GPA: " + classInfo.getAverageGPA());

        String result = String.format("%s  Students: %s GPA: %f ",
                classInfo.getClassname(),
                classInfo.getStudentCount(),
                classInfo.getAverageGPA()
        );
        System.out.println(result);

        System.out.println(
                String.format("%s  Students: %s GPA: %f ",
                    classInfo.getClassname(),
                    classInfo.getStudentCount(),
                    classInfo.getAverageGPA()
        ));


    }
}
