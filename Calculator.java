import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first whole number you would like to find sum with:");
        Integer firstNumber = userInput.nextInt();
        System.out.println("Enter the second whole number you would like to find sum with:");
        Integer secondNumber = userInput.nextInt();
        Integer sum;
        sum = firstNumber + secondNumber;
        System.out.println("sum = " + sum);
    }
}