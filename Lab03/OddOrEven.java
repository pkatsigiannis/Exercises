import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter an integer: ");
        int number = scan.nextInt();
        int result = number % 2;
        if (result > 0) System.out.println("The number is odd.");
        else System.out.println("The number is even.");      
    }
}