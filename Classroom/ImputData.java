/*********************************************************************
*************   Angel Guillermo Martínez Cruz       ******************
*************   ImputData.java                      ******************
*************   This pogram displays a personalized Hello greeting****
*********************************************************************/
import java.util.Scanner;

public class ImputData{
  public static void main(String[] args) {
    Scanner userData = new Scanner(System.in);
    String name;
    System.out.println("Enter your name");
    name=userData.nextLine();
    System.out.println("Hello " + name + "!");
  }
}
