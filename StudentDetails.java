import java.util.Scanner;

class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to student details portal");

        System.out.print("Enter student name: ");
        String str1 = input.nextLine();

        System.out.print("Enter Roll number: ");
        int roll = input.nextInt();
        
        System.out.print("Enter percentage: ");
        double percentage = input.nextDouble();

        System.out.println();
        
        System.out.println("Student details are following!!!");
        System.out.println("Name: " + str1);

        System.out.println("Roll Number: " + roll);

        System.out.println("Percentage: " + percentage);
    }    
}
