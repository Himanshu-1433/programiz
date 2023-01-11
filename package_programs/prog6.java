

// Java Program to Swap Two Numbers
class Refrence {
    public int num;
    public Refrence(int num){
         this.num = num;
    }
}
public class prog6 {
    public void callByValue(int a , int b)
    {
        System.out.println("Before The Swap  num1 = " + a + " num2 = "+ b);
        int c = a;
        a = b ;
        b = c ;
        System.out.println("after The Swap  num1 = " + a + " num2 = "+ b );
    }
    public void callByRef(Refrence  a ,  Refrence b )
    {
        System.out.println("Before The Swap  num1 = " + a.num + " num2 = "+ b.num);
        Refrence c = new Refrence(a.num);
        a.num = b.num;
        b.num = c.num; 
        System.out.println("after The Swap  num1 = " + a.num + " num2 = "+ b.num);
    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;         
        prog6 obj = new prog6();
        obj.callByValue(a, b);        
        System.out.println(" after call value funtion num1 = " + a + " num2 = "+ b);
        System.out.println("--------------------------------------------------");
        Refrence ref1 = new Refrence(10);
        Refrence ref2 = new Refrence(20);
        obj.callByRef(ref1, ref2);
        System.out.println(" after call refrence funtion num1 = " + ref1.num + " num2 = "+ ref2.num);
        
    }    
}
