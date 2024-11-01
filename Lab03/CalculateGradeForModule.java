import java.util.Scanner;

public class CalculateGradeForModule {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter your assignment grade: ");
        int assignment = scan.nextInt();
        System.out.print("Please, enter your final exam grade: ");
        int exam = scan.nextInt();
        double result = (0.4 * assignment + 0.6 * exam);
        if (result > 39) System.out.println("Your final mark is: " + result + ". Congratulations!");
        else System.out.println("Your final mark is: " + result + ". Better luck next time!");
    }
}
