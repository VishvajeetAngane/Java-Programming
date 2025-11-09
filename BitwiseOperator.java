import java.util.*;

class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Implementation of Bitwise Operators!!!");
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();

        System.out.print("Enter second number:");
        int num2 = input.nextInt();

        int result1 = num1 & num2;
        System.out.println("Result for bitwise and: "+ result1);

        int result2 = num1 | num2;
        System.out.println("Result for bitwise or: "+ result2);

        int result3 = num1 ^ num2;
        System.out.println("Result fot XOR: "+ result3);
    }    
}
