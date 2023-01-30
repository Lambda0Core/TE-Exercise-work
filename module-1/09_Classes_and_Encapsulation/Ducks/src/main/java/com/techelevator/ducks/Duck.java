package com.techelevator.ducks;

public class Duck {

<<<<<<< HEAD
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
=======
    // properties
    private String name;
    private String coloring;
    private double age;
    private double weight;

    //default constructor
    public Duck(){
//        this.name = "no-name";
//        this.age = 0.0;
//        this.weight = 0.0;
//        this.coloring = "";
        this("no-name", "no-color",0.0, 0.0);

    }

    public Duck(String name, String coloring, double age, double weight){
        this.name = name;
        this.coloring = coloring;
        if (age > 4 || age < 0){
            age = 4;
        }
        this.age = age;
        this.weight = weight;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
//    public void setName(String name){
//        this.name = name;
//    }

    public String getColoring(){
        return this.coloring;
    }
//    public void setColoring(String coloring){
//        this.coloring = coloring;
//    }

    public double getAge(){
        return this.age;
    }
//    public void setAge(double age){
//        if (age > 4 || age < 0){
//            age = 4;
//        }
//        this.age = age;
//    }

    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public char getDuckGrade(){
        if (weight > 0.1){ return 'z';};
        if (this.age > 1 && this.age < 3 && this.weight >= 1.9  ){
            return 'A';
        } else if (this.age >= 3){
            return 'B';
        } else {
            return 'C';
        }
    }

    public void eat() {
        this.weight += 0.3;
    }

    public String makeNoise(){
        return "Quack quack";
    }

    public String move(int mode){
        if (mode == 1){
            this.weight -= 0.1;
            return "swim";
        } else if (mode == 2){
            this.weight -= 0.2;
            return "fly";
        } else {
            this.weight -= 0.3;
>>>>>>> d3b9db890a27c0720e7649c218c98ade52f779ed
            return "waddle away";
        }
    }

<<<<<<< HEAD
    public String makeNoise() {
        return "Quack quack";
    }

    public void eat() {
        this.weight += 0.3;
    }
}


=======
}
>>>>>>> d3b9db890a27c0720e7649c218c98ade52f779ed
