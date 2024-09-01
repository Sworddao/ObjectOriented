//import models.Mammals;
//import  models.Aves;
//import org.w3c.dom.ls.LSOutput;
//
//public class Main {
//    public static void main(String[] args) {
//        Aves a1 = new Aves("Peacock");
//        Aves a2 = new Aves("Griffin");
//a1.getDetails();
//
//    }
//}
//
// Calculator
//Calculator -----> 2 classes: main, calculator
//it should have num1 and num2
// It should have a constructor, getter, setter
// functions ---> add, divide, multiply, subtract
//create calculator object

import java.util.Scanner;
import models.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator(num1, num2); // Creating calculator object

        // To display single operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        // Performing calculations based on user choice
        if (choice == 1) {
            System.out.println("Result of Addition: " + calculator.add());
        }
        else if (choice == 2) {
            System.out.println("Result of Subtraction: " + calculator.subtract());
        }
        else if (choice == 3) {
            System.out.println("Result of Multiplication: " + calculator.multiply());
        }
        else if (choice == 4) {
            if (calculator.getNum2() == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            }
            else {
                System.out.println("Result of Division: " + calculator.divide());
            }
        }
        else {
            System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

        scanner.close();
    }
}





