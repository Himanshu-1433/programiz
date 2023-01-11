import java.util.Scanner;

// Java Program to Check Whether a Number is Even or Odd
public class prog7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        double number = input.nextDouble();
        if(number % 2.0 == 0.0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        input.close();
    }
}
