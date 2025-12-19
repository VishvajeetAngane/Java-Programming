/*
Problem 1: Declare & Print Array
Write a Java program to:
    Declare an integer array of size 5
    Take input from the user
    Print all elements
*/

import java.util.Scanner;

class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!!!");
        System.out.print("Enter number of subjects:");
        int num = input.nextInt();

        int[] marks = new int[num];      //create a user entered number new array

        for(int i = 0; i < num ; i++){                                          // This for loop used for take the input array from user    
            System.out.print("Enter marks of subject number " + (i + 1) + " :");
            int mark = input.nextInt();
            marks[i] = mark;
        }

        System.out.println("Entered marks are :");

        for(int i = 0; i < num; i++){                       // This for loop used for output
            System.out.print(marks[i] + " ");
        }

    }    
}
