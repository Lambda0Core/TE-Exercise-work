package com.techelevator;

import java.io.*;

public class InClassDemo {
    public static void main(String[] args) {
       boolean result = makeDirectory("data");
        result = makeFile("dataFile.txt","./data");
        result = writeToFile("data","writeToFile.txt","successfully wrote to file.");
        result = writeToFile2("data","writeToFile2.txt","successfully wrote to file again.");
        result = writeToFile3("data","writeToFile3.txt","wrote to file.");
        result = writeToFile3("data","writeToFile3.txt","overwritten file.");
        System.out.println(result );
    }

    public static boolean makeDirectory(String newDirectory){
        File createdDirectory = new File(newDirectory);

        if (createdDirectory.exists()){
            return false;
        } else {
            createdDirectory.mkdir();
            return true;
        }
    }

    public static boolean makeFile(String newFileName){

        try {
            File newFileObject = new File(newFileName);
            newFileObject.createNewFile();
            return true;
        } catch (IOException ex){
            //log error
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static boolean makeFile(String newFileName, String directoryName){

        try {
            File newFileObject = new File(directoryName, newFileName);
            newFileObject.createNewFile();
            return true;
        } catch (IOException ex){
            //log error
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean writeToFile(String directoryName, String fileName, String message){
        File newFile = new File(directoryName, fileName);
        String newMessage = message;

        try {
            PrintWriter writer = new PrintWriter(newFile);
            writer.print(newMessage);
            writer.flush();
            writer.close();
            return true;
        } catch( FileNotFoundException ex){
            System.out.println("File does not exist.");
            return false;
        }
    }

    public static boolean writeToFile2(String directoryName, String fileName, String message){
        File newFile = new File(directoryName, fileName);
        String newMessage = message;

        try (PrintWriter writer = new PrintWriter(newFile)){
            writer.println(newMessage);
            writer.println(newFile.getName());
            writer.println("absolute path: " + newFile.getAbsolutePath());
            writer.println("size: " + newFile.length());
            return true;
        } catch( FileNotFoundException ex){
            System.out.println("File does not exist.");
            return false;
        }
    }

    public static boolean writeToFile3(String directoryName, String fileName, String message){
        File newFile = new File(directoryName, fileName);
        String newMessage = message;

       // boolean append = newFile.exists()? true: false;

//        try (PrintWriter writer = new PrintWriter(new FileOutputStream(newFile, append))){
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(newFile, newFile.exists()))){
            writer.append(newMessage + "\n");
            writer.append(newFile.getName()+ "\n");
            writer.append("absolute path: " + "\t" + newFile.getAbsolutePath()+ "\n");
            writer.append("size: " + newFile.length()+ "\n");
            return true;
        } catch( FileNotFoundException ex){
            System.out.println("File does not exist.");
            return false;
        }
    }
}






















