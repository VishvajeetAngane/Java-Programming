/* 
Problem 2: Sum of Array Elements
    Write a Java program to:
        Take n elements in an array
        Find and print the sum of all elements
*/

import java.util.Scanner;

class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To World of Sum Of Array!!!");

        System.out.print("Enter the number of person age: ");
        int num = input.nextInt();                              // get array size as input from user 

        int[] age = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("Enter the age of person number " + (i+1) + ": ");
            age[i] = input.nextInt();                           // get array element as input from user
        }

        System.out.print("\nArray Display: "); 
        for(int i = 0; i < num; i++){
            System.out.print(age[i] + " ");                     // display array
        }
        
        int sumOfAge = 0;
        for(int i = 0; i < num; i++){
            sumOfAge += age[i];                                 // calculate Sum Of Array elements
            
        }
        
        System.out.print("\nSum of ages:");
        System.out.print(sumOfAge);
    }    
}
