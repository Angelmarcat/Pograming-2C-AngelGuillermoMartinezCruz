/*************************************************************************************************
**************      Angel Guillermo  Martinez Cruz                         ***********************
**************      AreaOfCircle.java                                      ***********************
**************      This program calculate the area of a circunferece.     ***********************
**************************************************************************************************/
import java.util.Scanner;
public class AreaOfCircle{
  public static void main(String[] args) {
    double R;  //Radio de la circunferencia
    double PI=3.1416; // El valor de 3.1416
    double Area; //El area de la circunferencia
    Scanner in = new Scanner (System.in);
    System.out.println ("Ingresa el radio del circulo");
    R=in.nextDouble();
    Area=PI*(R*R);
    System.out.println ("La circunferencia del circulo es " + Area);
  }
}