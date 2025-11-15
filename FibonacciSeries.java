import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series checker!!!");

        System.out.print("Please enter the number to check upto the series: ");
        int num = input.nextInt();

        System.out.print("Fibonacci serirs upto " + num +" is: ");
        calculateFibonacci(num);
    }    

    public static void calculateFibonacci(int num){
        int first = 0, second = 1;

        while(first <= num){
            System.out.print(first + " ");

            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
