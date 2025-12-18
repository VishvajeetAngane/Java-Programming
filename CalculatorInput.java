import java.util.Scanner;

class CalculatorInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!!!");

        System.out.print("Enter 1st number:");
        int num1 = input.nextInt();

        System.out.print("Enter 2nd number:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + sum);

        int sub = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);

        int multi = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multi);

        int div = num1 / num2;
        System.out.println("Devision of " + num1 + " and " + num2 + " is " + div);

        int rem = num1 % num2;
        System.out.println("Remender of " + num1 + " and " + num2 + " is " + rem);
    }    
}
