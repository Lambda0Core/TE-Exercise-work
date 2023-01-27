package com.techelevator.ducks;

public class Duck {

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
            return "waddle away";
        }
    }

}
