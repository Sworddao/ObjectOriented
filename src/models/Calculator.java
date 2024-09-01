package models;

public class Calculator {
    private double num1;
    private double num2;

    // Constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter for num1
    public double getNum1() {
        return num1;
    }

    // Setter for num1
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Getter for num2
    public double getNum2() {
        return num2;
    }

    // Setter for num2
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}
