package exercises;
import java.util.Scanner;
public class numericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven: ");
        int numOfMilesDriven = input.nextInt();

        System.out.println("How many gallons of gas has your car used: ");
        int gallonsOfGas = input.nextInt();

        double mpg = numOfMilesDriven / gallonsOfGas;

        System.out.println("Your MPG is " + mpg);
    }
}
