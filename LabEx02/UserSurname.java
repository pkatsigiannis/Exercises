import java.util.Scanner;
public class UserSurname
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Please, enter your surname: ");
        String surname = scan.nextLine ();
        System.out.println ("Your surname is " + surname + ".");
    }
}