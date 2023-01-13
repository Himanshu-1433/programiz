package package_After10; 
// Java Program to Calculate the Sum of Natural Numbers
import java.util.Scanner;

class prog14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your start Number");
        int starting_year = input.nextInt();
        
        System.out.println("Enter your Ending Number");
        int end_year = input.nextInt();
        int sum = 0;
        for(int start = starting_year; start<=end_year;start++){
            sum += start;
        }
        System.out.print("The Sum of your number" + sum);
        input.close();
    }
}
