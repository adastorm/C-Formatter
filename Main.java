import javax.swing.JOptionPane;
import java.io.*;
class Main {
  String masterString;
  public static void main(String[] args) {
    JOptionPane.showConfirmDialog(null, "hola");
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

 addFunction(String Name, String preCon, String postCon)
 {
   masterString = masterString + name +"\n  PRECONDITION:" + 
 }
  
}