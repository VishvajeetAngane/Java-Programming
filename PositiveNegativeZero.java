import java.util.*;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to number checker...");

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Number is Positive");
        }
        else if(num == 0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}
