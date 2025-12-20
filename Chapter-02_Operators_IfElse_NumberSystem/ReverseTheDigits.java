import java.util.*;

class ReverseTheDigits {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse digit number!!!");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int reverseNum = reverseDigits(num);
        System.out.println("Reverse of " + num + " is " + reverseNum);
    }

    public static int reverseDigits(int num){

        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
