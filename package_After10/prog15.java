package package_After10;

import java.util.Scanner;
// factorial number 
public class prog15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Factorial number :");
        int userNumber = input.nextInt();
        int multiplyNumber = 1 ;
        for(int i = 1; i <= userNumber; i++ ){
            multiplyNumber = multiplyNumber * i ;
        }
        System.out.println(userNumber + " Factorial number :" + multiplyNumber);
        input.close();
    }
}
