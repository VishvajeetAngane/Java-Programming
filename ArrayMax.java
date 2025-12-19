import java.util.Scanner;

class ArrayMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of an array:");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter element for index " + i + " :");
            arr[i] = input.nextInt();
        }

        System.out.print("Array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int max = arr[0]; 
        for(int i = 1; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("\nGreatest element in array is: " + max);
    }    
}
