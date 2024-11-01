import java.util.Scanner;

public class TemperatureDegrees {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double degrees = 0;
        double result = 0;
        System.out.print("Please, enter the type of degrees you want to convert, \"c\" for celsius or \"f\" for fahrenheit: ");
        String tempType = scan.nextLine();

        if (tempType.charAt(0) == 'c') {
            System.out.print("Please, enter the degrees in celsius: ");
            degrees = scan.nextDouble();
            result = degrees*9/5 + 32;
            System.out.println("The temperature in fahrenheit is " + result);
        }
        else if (tempType.charAt(0) == 'f') {
            System.out.print("Please, enter the degrees in fahrenheit: ");
            degrees = scan.nextDouble();
            result = (degrees -32)*5/9;
            System.out.println("The temperature in celsius is " + result);
        }
    }
}