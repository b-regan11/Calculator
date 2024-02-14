import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the arithmetic you'd like to carry out; enter '1' for addition or '2' for subtraction.");
        Integer arithmetic = userInput.nextInt();

        System.out.println("Enter the first whole number:");
        Integer firstNumber = userInput.nextInt();
        System.out.println("Enter the second whole number:");
        Integer secondNumber = userInput.nextInt();
        
        Integer dif;
        Integer sum;

        sum = firstNumber + secondNumber;    
        dif = firstNumber - secondNumber;

        if (arithmetic == 1) {
            System.out.println("sum = " + sum);
        }
        else if (arithmetic == 2) {
            System.out.println("difference = " + dif);
        }
        else {
            System.out.println("please enter a valid input.");
        }
    }
}