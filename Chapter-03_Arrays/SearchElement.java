/* 
Problem : Search an Element (Linear Search)
    Write a Java program to:
            Search for a given number in the array Print found or not found
*/

import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome!!!");

       System.out.print("Enter the size of an array:");
       int size = input.nextInt();

       int[] arr = new int[size];

       for(int i = 0; i < size ; i++){
            System.out.print("Enter the number for index " + i + " : ");
            arr[i] = input.nextInt(); 
       }

       System.out.print("Array elements are: ");
       for(int i = 0; i < size; i++){
            System.out.print(arr[i]  + " ");
       }

       System.out.print("\nEnter the number which you want to search:");
       int num = input.nextInt();

       boolean found = false;

       for(int i = 0; i < size; i++){
            if(arr[i] == num){
                found = true;
                break;
            }
       }

       if(found){
        System.out.println(num + " is found!!!");
       }
       else{
        System.out.println(num + " is not found!!!");
       }
    }
}
