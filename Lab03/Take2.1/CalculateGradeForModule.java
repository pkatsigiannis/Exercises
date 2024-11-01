import java.util.Scanner;

public class CalculateGradeForModule {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter your assignment grade: ");
        int assignment = scan.nextInt();
        System.out.print("Please, enter your exam grade: ");
        int exam = scan.nextInt();
        double mark = (0.4*assignment + 0.6*exam);

        if (mark > 39) System.out.println("Your final mark is " + mark + ". Congratulations!");
        else System.out.println("Your final mark is " + mark + ". Better luck next time...");
    }
}