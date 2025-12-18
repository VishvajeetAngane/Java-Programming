import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!!!");

        System.out.print("Enter Integer Number: ");
        int int1 = input.nextInt();

        System.out.print("Enter Floating Number: ");
        float float1 = input.nextFloat();

        System.out.print("Enter A character: ");
        char char1 = input.next().charAt(0);  // charAt(0) used for access the 1st character of the string if we write charAt(1) then it access the 2nd character from string

        System.out.print("Enter a one word string: ");
        String str1 = input.next();

        input.nextLine(); // if this line can't write then next string input is not working 

        System.out.print("Enter a String: ");
        String str2 = input.nextLine();

        System.out.println("Output :) ");
        System.out.println(int1 + " " + float1 + " " + char1 + " " + str1 + " " + str2);
        
    }    
}
