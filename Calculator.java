import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the arithmetic you'd like to carry out:");
        System.out.println("| 1 -> addition | 2 -> subtraction | 3 -> multiplcation | 4 -> division |");
        Integer arithmetic = userInput.nextInt();

        System.out.println("Enter the first whole number:");
        Integer firstNumber = userInput.nextInt();
        System.out.println("Enter the second whole number:");
        Integer secondNumber = userInput.nextInt();
        
        Integer sum;    // Sum
        Integer dif;    // Difference
        Integer pro;    // Product
        Integer quo;       // Quotient

        sum = firstNumber + secondNumber;    
        dif = firstNumber - secondNumber;
        pro = firstNumber * secondNumber;
        quo = firstNumber / secondNumber;

        if (arithmetic == 1) {
            System.out.println("sum = " + sum);
        }
        else if (arithmetic == 2) {
            System.out.println("difference = " + dif);
        }
        else if (arithmetic == 3) {
            System.out.println("multiplication = " + pro);
        }
        else if (arithmetic == 4) {
            System.out.println("quotient = " + quo);
        }
        else {
            System.out.println("please enter a valid input.");
        }
    }
}