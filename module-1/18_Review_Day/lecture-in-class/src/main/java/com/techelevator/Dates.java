package com.techelevator;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Dates {

    public static void main(String[] args) {
        //current date
        LocalDate local = LocalDate.now();
        System.out.println(local);

        //local time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //local date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //format
        LocalDateTime  dateObject = localDateTime.now();
        System.out.println("Before formatting: " + dateObject);
        DateTimeFormatter formatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = dateObject.format(formatObject);
        System.out.println("Formatted date:" + formattedDate);

        //a better way
        //use calendar object not localDate/localDateTime
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        formattedDate = dateFormat.format(date);
        System.out.println( String.format("calendar date %s" , formattedDate));



    }
}
