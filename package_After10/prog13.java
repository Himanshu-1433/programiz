package package_After10;
import java.io.*;
// Java Program to Check Whether a Character is Alphabet or No
import java.util.Scanner;
public class prog13 {
    
    public static void main(String[] args) throws IOException{
        System.out.print("Enter : ");
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        new prog13(c);        

        input.close();
    }
    
    public prog13(char chr){
        try{
            if(Character.isAlphabetic(chr)){
                if(chr == 'A' || chr == 'a'){
                    System.out.println(" The Character is Vowel");
                }
                else if(chr == 'E' || chr == 'e'){
                    System.out.println(" The Character is Vowel");
                }
                else if(chr == 'I' || chr == 'i'){
                    System.out.println(" The Character is Vowel");
                }
                else if(chr == 'O' || chr == 'o'){
                    System.out.println(" The Character is Vowel");
                }
                else if(chr == 'U' || chr == 'u'){
                    System.out.println(" The Character is Vowel");
                }
                else{
                    System.out.println(" The Character is Alphabet");
                }    
            }
            else{
                System.out.println(" The Character is not Alphabet");
            }
        }
        catch (Exception e){
             System.out.println("Error : " + e);
        }
        
    }
}
