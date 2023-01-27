package com.techelevator.ducks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuckApplication {
    public static void main(String[] args) {

        List<Duck> flock = new ArrayList<>();
        flock.add(new Duck("Huey", "White", true, 2, 2));
        flock.add(new Duck("Louie", "White", true, 1, 2));
        flock.add(new Duck("Dewey", "White", true, 1, 2));
        flock.add(new Duck("Donald", "White", true, 3, 2));
        flock.add(new Duck("Scrooge", "White", true, 2, 2));
        flock.add(new Duck("Daisy", "White", true, 5, 2));
        for(Duck duck: flock){
            System.out.println(duck.getName() + " weighs " + duck.getWeight());
            System.out.println("Grade: " + duck.getDuckGrade());
        }
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
    }
}
