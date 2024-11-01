import java.util.Scanner;

public class TemperatureDegrees {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double result = 0;
        double degrees = 0;
        System.out.print("Please, enter the temperature unit you want to convert, \"c\" for celsius or \"f\" for fahrenheit: ");
        String tempType = scan.nextLine();
        
        if (tempType.charAt(0) == 'c') {
        System.out.print("Please, enter degrees in celsius: ");
        degrees = scan.nextDouble();
        result = (9 * degrees) / 5 + 32;
        System.out.println("Temperature in fahrebheit: " + result);
        }
        else if (tempType.charAt(0) == 'f') {
        System.out.print("Please, enter degrees in farenheit: ");
        degrees = scan.nextDouble();
        result = (degrees - 32)*5/9;
        System.out.println("Temperature in celsius: " + result);
        }
    }
}