//Jonah Watts, 2021
import java.io.*;
import java.util.*;

class Main {
 
  public static void main(String[] args) {
    String masterString = "";
    Scanner s = new Scanner(System.in);

    //First get the class name for the file
    System.out.println("Please Enter the name of your class");
    String filename =  s.nextLine()+ ".txt";
    File myObj = new File(filename);
    myObj.deleteOnExit();
    try 
    {
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

    //Now start the input for  constructor
    System.out.println("Do you have a Constructor / destructor [y/n]");
    if(s.nextLine().toLowerCase().equals("y"))
    {
      masterString+= "Constructors:\n";
      boolean loop = true;
      while(loop)
      {
        System.out.println("Please enter the constructor name and parameters");
        String nameString = s.nextLine();
        System.out.println("Please enter the preconditions");
        String preString = s.nextLine();
        System.out.println("Please enter the postconditions");
        String postString = s.nextLine(); 
        masterString += addFunction(nameString,preString,postString);

        System.out.println("Do you want to add another constructor?");
        if(s.nextLine().toLowerCase().equals("y")!= true) loop = false;
      }
    }

    System.out.println("Do you have a getter functions [y/n]");
    if(s.nextLine().toLowerCase().equals("y"))
    {
      masterString+= "Getter Functions:\n";
      boolean loop = true;
      while(loop)
      {
        System.out.println("Please enter the getter name and parameters");
        String nameString = s.nextLine();
        System.out.println("Please enter the preconditions");
        String preString = s.nextLine();
        System.out.println("Please enter the postconditions");
        String postString = s.nextLine(); 
        masterString += addFunction(nameString,preString,postString);

        System.out.println("Do you want to add another constructor?");
        if(s.nextLine().toLowerCase().equals("y")!= true) loop = false;
      }     
    }
    System.out.println("Do you have a setter functions [y/n]");
    if(s.nextLine().toLowerCase().equals("y"))
    {
      masterString+= "Setter Functions:\n";
      boolean loop = true;
      while(loop)
      {
        System.out.println("Please enter the setter name and parameters");
        String nameString = s.nextLine();
        System.out.println("Please enter the preconditions");
        String preString = s.nextLine();
        System.out.println("Please enter the postconditions");
        String postString = s.nextLine(); 
        masterString += addFunction(nameString,preString,postString);

        System.out.println("Do you want to add another constructor?");
        if(s.nextLine().toLowerCase().equals("y")!=true) loop = false;
      }
    }

    
    try {
      FileWriter mine = new FileWriter(filename);
      mine.write(masterString);
      mine.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    System.out.println("Now go save your text in the file, because on exit the program will delete it");
    s.nextLine();

    s.close();
  }


private static String addFunction(String name, String preCon, String postCon)
 {
   return "  " +name +"\n  PRECONDITION:" + preCon + "\n  POSTCONDITION:"+postCon + "\n";
 }

}