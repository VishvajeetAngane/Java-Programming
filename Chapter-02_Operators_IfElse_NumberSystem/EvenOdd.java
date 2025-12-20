import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to number checker!!!");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println("NUmber is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }    
}
