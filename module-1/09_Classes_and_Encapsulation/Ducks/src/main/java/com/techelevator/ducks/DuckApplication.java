package com.techelevator.ducks;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuckApplication {

    public static void main(String[] args) {
        List<Duck> flock = new ArrayList<>();
        flock.add(new Duck("Huey", "white",2,2));
        flock.add(new Duck("Louie", "white",2,2));
        flock.add(new Duck("Dewey", "white",2,2));
        flock.add(new Duck("Donald", "white",2,2));
        flock.add(new Duck("Scrooge", "white",2,2));
        flock.add(new Duck("Daisy", "white",2,2));

        for(Duck duck: flock){
            System.out.println(duck.getName() + " weighs " + duck.getWeight());
            System.out.println("Grade: " + duck.getDuckGrade());
        }

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

    }
}
