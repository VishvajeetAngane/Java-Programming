// Problem : Sum of Elements at Even Index

import java.util.Scanner;

class SumEvenIndex { 

    public static void showArray(int[] arr){                    // This method is used for show the array elements
        System.out.print("\nArray elements are: ");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static int SumOfEvenIndex(int[] arr){                // This method is used for Calculate and return the sum of even index 
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                sum += arr[i];
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!!!");
        System.out.print("Enter the size of an array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the element for index " + i + ": ");
            arr[i] = input.nextInt();
        }

        showArray(arr);

        int sum = SumOfEvenIndex(arr);
        System.out.println("\nSum of Even Index: " + sum);
    }    
}
