package exercises;
import java.util.Scanner;
public class rectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's width: ");
        int width = input.nextInt();

        System.out.println("What is the rectangle's length: ");
        int length = input.nextInt();

        int rectArea = width * length;

        System.out.println("The area of the triangle is " + rectArea);
    }
}
