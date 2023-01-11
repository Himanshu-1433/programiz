// Java Program to Add Two Integers
import java.util.*;
class prog2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println("the number Addtion is : "+(number1+number2));
        input.close();
    }
}