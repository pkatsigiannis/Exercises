import java.util.Scanner;
public class TriangleCalculation
{
 public static void main (String[] args)
 {
    Scanner scan = new Scanner (System.in);
    System.out.print ("Please, enter the base length: ");
    double base = scan.nextDouble ();
    System.out.print ("Please, enter the length of side a: ");
    double sideA = scan.nextDouble ();
    System.out.print ("Please, enter the length of side b: ");
    double sideB = scan.nextDouble ();
    System.out.print ("Please, enter the height: ");
    double height = scan.nextDouble ();
    System.out.println ("The are of the triangle is: " + (base*height)/2);
    System.out.println ("The perimeter of the triangle is: " + (sideA+sideB+height));
 }   
}
