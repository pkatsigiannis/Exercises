import java.util.Scanner;

public class OddOrEven
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter an integer: ");
        int input = scan.nextInt();
        int result = input % 2;

        if (result == 1) System.out.println("The number your entered is odd.");
        else System.out.println("The number you entered is even.");
    }
}