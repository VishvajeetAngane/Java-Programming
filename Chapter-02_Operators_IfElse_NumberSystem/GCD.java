import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD!!!");

        System.out.print("Enter your first number:");
        int num1 = input.nextInt();

        System.out.print("Enter your second number:");
        int num2 = input.nextInt();

        int gcd = gcd(num1, num2);
        System.out.println("GCD of nunmbers: " + gcd);
    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int minimum = minimum(num1, num2);

        while (i < num1) {
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }


    public static int minimum(int num1, int num2){
        if(num1 < num2){
            return num1; 
        }
        else{
            return num2;
        }
    }


}
