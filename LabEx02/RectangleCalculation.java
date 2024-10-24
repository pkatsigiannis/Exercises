import java.util.Scanner;
public class RectangleCalculation
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Please, enter the length of one side: ");
        double sideA = scan.nextDouble ();
        System.out.print ("Please, enter the length of a perpendicular side: ");
        double sideB = scan.nextDouble ();
        System.out.println ("The area of the rectangle is: " + sideA*sideB);
        System.out.println ("The perimeter of the rectangle is: " + 2*(sideA+sideB));
    }
}