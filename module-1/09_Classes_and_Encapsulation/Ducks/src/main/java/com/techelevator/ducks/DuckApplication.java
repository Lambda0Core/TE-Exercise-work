package com.techelevator.ducks;

<<<<<<< HEAD
=======

>>>>>>> d3b9db890a27c0720e7649c218c98ade52f779ed
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuckApplication {
<<<<<<< HEAD
    public static void main(String[] args) {

        List<Duck> flock = new ArrayList<>();
        flock.add(new Duck("Huey", "White", true, 2, 2));
        flock.add(new Duck("Louie", "White", true, 1, 2));
        flock.add(new Duck("Dewey", "White", true, 1, 2));
        flock.add(new Duck("Donald", "White", true, 3, 2));
        flock.add(new Duck("Scrooge", "White", true, 2, 2));
        flock.add(new Duck("Daisy", "White", true, 5, 2));
=======

    public static void main(String[] args) {
        List<Duck> flock = new ArrayList<>();
        flock.add(new Duck("Huey", "white",2,2));
        flock.add(new Duck("Louie", "white",2,2));
        flock.add(new Duck("Dewey", "white",2,2));
        flock.add(new Duck("Donald", "white",2,2));
        flock.add(new Duck("Scrooge", "white",2,2));
        flock.add(new Duck("Daisy", "white",2,2));

>>>>>>> d3b9db890a27c0720e7649c218c98ade52f779ed
        for(Duck duck: flock){
            System.out.println(duck.getName() + " weighs " + duck.getWeight());
            System.out.println("Grade: " + duck.getDuckGrade());
        }
<<<<<<< HEAD
        int i = 1;
        for(Duck duck: flock){
        duck.eat();
        duck.move((i% 3) + 1);
            System.out.println(duck.getName() + " weighs " + duck.getWeight());


        }
        Map<String, Duck> flockMap = new HashMap<>();
        flockMap.put("Huey", new Duck("Huey", "White", true, 2, 2));
        flockMap.put("Louie", new Duck("Louie", "White", true, 2, 2));
        flockMap.put("Dewey", new Duck("Dewey", "White", true, 2, 2));
        flockMap.put("Donald", new Duck("Donald", "White", true, 2, 2));
        flockMap.put("Daisy", new Duck("Daisy", "White", true, 2, 2));

        System.out.println(flockMap.get("Huey").getName());

        Duck someDuck = flockMap.get("Louie");
        System.out.println(someDuck.getName() + " " + someDuck.getWeight());
=======

        int i = 1;
        for(Duck duck: flock){
            duck.eat();
            duck.move((i % 3) + 1);
            System.out.println(duck.getName() + " weighs " + duck.getWeight());
            i++;
        }

        Map<String, Duck> flockWithNames = new HashMap<>();
        flockWithNames.put("Huey1", new Duck("Huey1", "white", 2, 2));
        flockWithNames.put("Huey2", new Duck("Huey2", "white", 2, 2));
        flockWithNames.put("Huey3", new Duck("Huey3", "white", 2, 2));
        flockWithNames.put("Huey4", new Duck("Huey4", "white", 2, 2));
        flockWithNames.put("Huey5", new Duck("Huey5", "white", 2, 2));
        flockWithNames.put("Huey6", new Duck("Huey6", "white", 2, 2));
        flockWithNames.put("Huey7", new Duck("Huey7", "white", 2, 2));

        System.out.println(flockWithNames.get("Huey1").getName());
        Duck someDuck = flockWithNames.get("Huey1");
        System.out.println(someDuck.getName() + " " + someDuck.getWeight());

>>>>>>> d3b9db890a27c0720e7649c218c98ade52f779ed
    }
}
