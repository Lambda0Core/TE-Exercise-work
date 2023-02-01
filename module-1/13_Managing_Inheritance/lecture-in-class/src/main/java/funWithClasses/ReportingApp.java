package funWithClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ReportingApp {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Random randomNum = new Random();
            students.add(new Student("Student " + randomNum.nextInt(100), randomNum.nextInt(100),randomNum.nextInt(100), randomNum.nextInt(100) ));

        }


        for(Student student : students){
            System.out.println(student.toString());
        }



    }
}
