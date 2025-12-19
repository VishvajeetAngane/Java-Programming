import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to palindrome checker!!!");
        System.out.print("Enter the number:");
        int num = input.nextInt();

        if(palindromeChecker(num)){
            System.out.println(num + " is palindrome");
        }
        else{
            System.out.println(num + " is not palindrome");
        }
    }   
    
    public static boolean palindromeChecker(int num){
        int originalNum = num; 
        int newNum = 0;

        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return originalNum == newNum;
    }
}
