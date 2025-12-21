import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!!!");
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the element for index " + i + " :");
            arr[i] = input.nextInt();    
        }

        System.out.print("Original Array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        int low = 0;
        int high = size-1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        System.out.print("\nReversed array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        
        input.close();
    }    
}
