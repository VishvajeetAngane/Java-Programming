import java.util.*;

class LeapYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Leap Year checker!!!");
        System.out.print("Enter the year that you want to check:");
        int year = input.nextInt();

        if(year%400 == 0 || (year%4 == 0 && year%100 != 0)){
            System.out.println(year +" is Leap year!!!");
        }
        else{
            System.out.println(year+ " is not Leap year!!!");
        }
    }
    
}
