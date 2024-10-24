import java.util.Scanner;
public class Percentage
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Please, enter the first nr: ");
        double a = scan.nextDouble ();
        System.out.print ("Please, enter the second nr: ");
        double b = scan.nextDouble ();
        double percentage = b/a*100;
        System.out.println ("The second nr is: " + percentage + "% of the first.");
    }
}