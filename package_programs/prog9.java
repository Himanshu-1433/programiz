// Java Program to Find the Largest Among Three Numbers
interface findMax{
    public int numbers(
    int num1 , 
    int num2 , 
    int num3 
    );
}
public class prog9 implements findMax{
    public int numbers( int num1 , int num2 , int num3 )
    {
        int num = Math.max(num1, Math.max(num2, num3));
        return num;
    }
    public static void main(String[] args) {
        prog9 obj = new prog9();
        System.out.println(obj.numbers(10, 20, 30));
    }
}
