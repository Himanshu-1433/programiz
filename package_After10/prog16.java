package package_After10;

import java.util.Scanner;
// multiplication table
public class prog16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Table number :");
        int userNumber = input.nextInt();
            for(int j = 1; j <=10; j++ ){            
                System.out.println(userNumber + " * " + j + " = " + userNumber * j );
            }
        input.close();
    }
}
