//Jonah Watts, 2021
import java.io.*;
import java.util.*;

class Main {
  
  //Data
  private String masterString;
  scanner s = new scanner(System.in);

  public static void main(String[] args) {
    masterString= new String("");


    //First get the class name for the file
    System.out.println("Please Enter the name of your class");


    try 
    {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } 
    catch (IOException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    
  }

/*
 private void addFunction(String Name, String preCon, String postCon)
 {
   masterString = "" + masterString +"  " +name +"\n  PRECONDITION:" + precon + "\n  POSTCONDITION:"+postCon + "\n";
 }
  */
}