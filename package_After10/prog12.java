package package_After10;

// Java Program to Check Whether a Number is Positive or Negative
public class prog12 {
    public prog12(double num){
        if(num > 0){
            System.out.println(" The number is positive");
        }
        else if(num < 0){
            System.out.println(" The number is negetive");
        }
        else{
            System.out.println(" The number is Zero");
        }
    }
    public static void main(String[] args) {
        prog12 obj = new prog12(-10.100);        
    }
}
