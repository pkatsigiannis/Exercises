import java.util.Scanner;
public class UserName
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Please, enter your name: ");
        String name = scan.nextLine ();
        System.out.println ("Your name is " + name + ".");
    }
}