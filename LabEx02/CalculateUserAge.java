import java.util.Scanner;

public class CalculateUserAge
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Please, enter your name: ");
        String name = scan.nextLine ();
        System.out.print ("Please, enter your year of birth: ");
        int yearOfBirth = scan.nextInt ();
        int age = 2024 - yearOfBirth;
        System.out.println ("Your name is " + name + " and you are " + age + " years old.");
    }
}