import java.util.Scanner;

public class GradeProgram {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter your grade: ");
        int grade = scan.nextInt();
        if (grade > 39) System.out.println("You passed!");
        else System.out.println("You failed.");
    }
}
