import java.util.Scanner;
public class MakingCalculations
{
    public static void main (String[] args)
    {
            Scanner scan = new Scanner (System.in);
            System.out.print ("Please, enter an integer: ");
            int b = scan.nextInt ();
            double a = 82.5;
            double sum = a + b;
            double difference = a - b;
            double product = a * b;
            double quotient = a / b;
            System.out.println ("The sum is: " + sum);
            System.out.println ("The difference is: " + difference);
            System.out.println ("The product is: " + product);
            System.out.println ("The quotient is: " + quotient);
    }
}