import java.util.Scanner;

public class GradeProgramWithInputCheck {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter your grade: ");
        int grade = scan.nextInt();

        if (grade < 1 || grade > 100) {
            System.out.print("Please, enter a valid grade: ");
            int valid = scan.nextInt();

            if (valid > 39) {
                System.out.println("Congratulations!");
            }
            else {
                System.out.println("Better luck next time...");
            }
        }
        else if (grade > 39) {
            System.out.println("Congratulations!");
        }
        else {
            System.out.println("Better luck next time...");
        }
    }
}