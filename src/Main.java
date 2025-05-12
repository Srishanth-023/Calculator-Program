import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Simple Calculator

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("Welcome to THE CALCULATOR 🧮\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the # 1: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        // Termination of Calculation at the top !
//        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^') {
//            //
//        } else {
//            System.out.println("\nInvalid operator entered: " + operator);
//            System.out.println("\nThank you for using THE CALCULATOR !!");
//            scanner.close();
//            return;
//        }

        System.out.print("Enter the # 2: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("You cannot divide by 0 !");
                    validOperator = false;
                } else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("\nYou chose an invalid operator !!");
                validOperator = false;
            }
        }

        if (validOperator){
            System.out.println("\n" + result);
        }

        scanner.close();

        System.out.println("\nThank you for using THE CALCULATOR !!");
    }
}

