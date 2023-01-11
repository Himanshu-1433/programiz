// Java Program to Print an Integer (Entered by the User)
import java.util.*;
class prog1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int number1 = input.nextInt();
        System.out.println("Number is : "+number1);
        input.close();
    }
}