package com.techelevator;

public class HomeworkAssignment {
    //Properties
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;
    //Getters and Setters
    public int getEarnedMarks(){
        return this.earnedMarks;
    }
    public int getPossibleMarks(){
        return this.possibleMarks;
    }
    public String getSubmitterName(){
        return this.submitterName;
    }
        public void setEarnedMarks(int earnedMarks) {
            this.earnedMarks = earnedMarks;
        }
    //Constructor
    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.earnedMarks = earnedMarks;
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }
    //Method
    public String getLetterGrade() {

        double percent = getEarnedMarks()* 100 / getPossibleMarks();

        if (percent >= 90) {
            letterGrade = "A";
        } else if (percent >= 80) {
            letterGrade = "B";
        } else if (percent >= 70) {
            letterGrade = "C";
        } else if (percent >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}


