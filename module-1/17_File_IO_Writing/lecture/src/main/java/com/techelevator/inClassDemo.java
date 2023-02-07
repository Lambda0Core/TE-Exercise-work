package com.techelevator;

import java.io.*;

public class inClassDemo {
    public static void main(String[] args) {
        boolean result = makeDirectory("data");
        result = makeFile("dataFile.txt", "./data");
        result = writeToFile("data", "writeToFile.txt","successfully wrote to file");
        result = writeToFile2("data", "writeToFile2.txt","successfully wrote to file again");
        result = writeToFile3("data", "writeToFile3.txt","successfully wrote to file yet again!");
    }

    public static boolean makeDirectory(String newDirectory) {
        File createdDirectory = new File(newDirectory);

        if (createdDirectory.exists()) {
            return false;
        } else {
            createdDirectory.mkdir();
            return true;
        }
    }

    public static boolean makeFile(String newFileName) {

        try {
            File newFileObject = new File(newFileName);
            newFileObject.createNewFile();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
  }
    public static boolean makeFile(String newFileName, String directoryName) {
        try {
            File newFileObject = new File(directoryName, newFileName);
            newFileObject.createNewFile();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

  public static boolean writeToFile(String directoryName, String fileName, String message){
        File newFile = new File(directoryName, fileName);
        String newMessage = message;

        try {
            PrintWriter writer = new PrintWriter(newFile);
            writer.print(message);
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
            writer.print(message);
            writer.println(newFile.getName());
            writer.println("absolute path: " + newFile.getAbsolutePath());
            writer.println("file size: " + newFile.getTotalSpace());

            return true;
        } catch( FileNotFoundException ex){
            System.out.println("File does not exist.");
            return false;
        }
    }
    public static boolean writeToFile3(String directoryName, String fileName, String message){
        File newFile = new File(directoryName, fileName);
        String newMessage = message;
//        boolean append = newFile.exists()? true: false;

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(newFile, newFile.exists()))){
            writer.append(newMessage);
            writer.print(message);
            writer.println(newFile.getName());
            writer.println("absolute path: " + newFile.getAbsolutePath());
            writer.println("file size: " + newFile.length());

            return true;
        } catch( FileNotFoundException ex){
            System.out.println("File does not exist.");
            return false;
        }
    }
}
