package com.techelevator.ducks;

public class Duck {

    private String name;
    private String coloring;
    private boolean isItAlive;
    private double age;
    private double weight;

   public Duck(){
       this("New001", "White", true, 1.0, 0.1);
   }
   public Duck(String name, String coloring, boolean isItAlive, double weight, double age){
       this.name = name;
       this.isItAlive = isItAlive;
       this.age = age;
       this.weight = weight;
       this.coloring = coloring;
   }
   public char getDuckGrade() {
       if (this.age > 1 && this.age < 2 && this.weight >= 2.5) {
           return 'A';
       } else if (this.age >= 3 && this.age <= 4) {
           return 'B';
       } else {
           return 'C';
       }
   }
    public String getName(){
        return this.name;
    }
    public void getName(String name){
        this.name = name;
    }
    public String getColor(){
        return this.coloring;
    }
    public void getColor(String coloring){
        this.coloring = coloring;
    }
    public boolean getLife(){
        return this.isItAlive;
    }
    public void getLife(Boolean isItAlive){
        this.isItAlive = isItAlive;
    }
    public double getWeight(){
        return this.weight;
    }
    public void getWeight(double weight){
        this.weight = weight;
        }
    public double getAge(){
        return this.age;
    }
    public void getAge(double age){
        this.age = age;
        if (age >= 4){
            this.isItAlive = false;
        }
    }

    public String move(int mode) {
        if (mode == 1) {
            this.weight -= 0.1;
            return "swim";
        } else if (mode == 2) {
            this.weight -= 0.5;
            return "fly";
        } else {
            this.weight -= 0.01;
            return "waddle away";
        }
    }

    public String makeNoise() {
        return "Quack quack";
    }

    public void eat() {
        this.weight += 0.3;
    }
}


