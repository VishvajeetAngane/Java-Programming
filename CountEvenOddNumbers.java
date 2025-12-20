/*
Problem: Count Even & Odd Numbers
    Write a Java program to:
    Count how many even and odd numbers are in an array
*/

import java.util.Scanner;

class CountEvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Even odd checker world!!!");
        System.out.print("Enter the size of an array:");
        int size = input.nextInt();

        int[] arr = new int[size];              //create user input size array

        for(int i = 0; i < size; i++){              // This for loop for user input 
            System.out.print("Enter value for " + i + " index: ");
            arr[i] = input.nextInt();
        }

        System.out.print("\nArray elements are: ");         // This for loop for display an array
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int even = 0;
        int odd = 0;
        for(int i = 0; i < size; i++){                         // This for loop for logic of even odd count 
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("\nCount of even numbers: " + even);
        System.out.println("Count of odd numbers: " + odd);
    }    
}
