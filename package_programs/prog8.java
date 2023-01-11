// Java Program to Check Whether an Alphabet is Vowel or Consonant
public class prog8 {
    public static void main(String[] args) {
        char[] vowels = {'A' , 'a' , 'E' , 'e' , 'i' , 'I' , 'O' , 'o' , 'U' , 'u'};
        char userChar = 't';
        String Answer = " "; 
        for(int i = 0; i<vowels.length; i++){

            if(userChar == vowels[i])
            {
                Answer = "Vowel";
                break;
            }
            if(!(userChar == vowels[i])){
                 Answer = "Consonant";
            }
            
        }
        System.out.println("Your Word is = "+Answer);
    }
}
