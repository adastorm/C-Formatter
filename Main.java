//Jonah Watts, 2021
import java.io.*;
import java.util.*;

class Main {
 
  public static void main(String[] args) {
    String masterString = "";
    Scanner s = new Scanner(System.in);

    //First get the class name for the file
    System.out.println("--Please Enter the name of your class");
    String filename =  s.nextLine()+ ".txt";
    File myObj = new File(filename);

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
    System.out.println("--Do you have a Constructor / destructor [y/n]");
    if(s.nextLine().toLowerCase().equals("y"))
    {
      masterString+= "Constructors:\n";
      boolean loop = true;
      while(loop)
      {
        System.out.println("--Please enter the constructor name and parameters");
        String nameString = s.nextLine();
        System.out.println("--Please enter the preconditions");
        String preString = s.nextLine();
        System.out.println("--Please enter the postconditions");
        String postString = s.nextLine(); 
        masterString += addFunction(nameString,preString,postString);

        System.out.println("--Do you want to add another constructor?");
        if(s.nextLine().toLowerCase().equals("y")!= true) loop = false;
      }
    }

    System.out.println("Do you have a Accessor functions [y/n]");
    if(s.nextLine().toLowerCase().equals("y"))
    {
      masterString+= "Accessor Functions:\n";
      boolean loop = true;
      while(loop)
      {
        System.out.println("--Please enter the Accessor name and parameters");
        String nameString = s.nextLine();
        System.out.println("--Please enter the preconditions");
        String preString = s.nextLine();
        System.out.println("--Please enter the postconditions");
        String postString = s.nextLine(); 
        masterString += addFunction(nameString,preString,postString);

        System.out.println("--Do you want to add another Accessor?");
        if(s.nextLine().toLowerCase().equals("y")!= true) loop = false;
      }     
    }
    System.out.println("--Do you have a Modifier functions [y/n]");
    if(s.nextLine().toLowerCase().equals("y"))
    {
      masterString+= "Modifier Functions:\n";
      boolean loop = true;
      while(loop)
      {
        System.out.println("--Please enter the Modifier name and parameters");
        String nameString = s.nextLine();
        System.out.println("--Please enter the preconditions");
        String preString = s.nextLine();
        System.out.println("--Please enter the postconditions");
        String postString = s.nextLine(); 
        masterString += addFunction(nameString,preString,postString);

        System.out.println("--Do you want to add another Modifier?");
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
    System.out.println("--If running locally, the reult will be stored in a .txt file\n --Would you like it returend in the terminal [y/n]");
    if(s.nextLine().toLowerCase().equals("y")) System.out.print(masterString);

    s.close();
  }


private static String addFunction(String name, String preCon, String postCon)
 {
   return "  " +name +"\n  PRECONDITION:" + preCon + "\n  POSTCONDITION:"+postCon + "\n\n";
 }

}