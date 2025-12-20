import java.util.Scanner;

class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        
        int number = input.nextInt();
        input.close(); 
        
        int originalNumber = number; 
        
        int count = String.valueOf(number).length();
        
        int sumOfPowers = 0;
        int tempNumber = number; 

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            
            sumOfPowers += (int) Math.pow(digit, count);
            
            tempNumber /= 10;
        }

        if (sumOfPowers == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}