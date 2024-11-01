import java.util.Scanner;

public class FindClassification {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter your grade: ");
        int grade = scan.nextInt();

        if (grade < 40) System.out.println("Fail");

        else if (grade > 39 && grade < 50) System.out.println("Class IV");

        else if (grade > 49 && grade < 60) System.out.println("Class III");

        else if (grade > 59 && grade < 70) System.out.println("Class II");

        else if (grade > 69) System.out.println("Class I");
    }
}