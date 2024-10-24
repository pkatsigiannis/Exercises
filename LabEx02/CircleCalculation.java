import java.util.Scanner;
public class CircleCalculation
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Please, enter the radius: ");
        double radius = scan.nextDouble ();
        System.out.println ("The area of the circle is: " + (radius*radius*3.14));
        System.err.println ("The circumference is: " + (2*3.14*radius));
    }
}
