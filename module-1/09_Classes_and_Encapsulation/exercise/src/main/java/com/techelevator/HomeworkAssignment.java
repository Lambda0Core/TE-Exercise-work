package com.techelevator;

public class HomeworkAssignment {
    //Properties
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    //Constructors

    //Getters & Setters
    public String getLetterGrade(){
        if (letterGrade >= 90){
          return "A";
        }else if (letterGrade >= 80 && letterGrade <= 89){
            return "B";
        }else if (letterGrade >= 70 && letterGrade <= 79){
            return "C";
        }else if (letterGrade >= 60 && letterGrade <= 69){
            return "D";
        }else{
            return "F";
        }
    }

    //Methods

}


