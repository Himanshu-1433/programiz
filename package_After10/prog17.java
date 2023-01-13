package package_After10;

import java.util.Scanner;
// fibonanci number
public class prog17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fibonanci number :");
        int Fibonanci = input.nextInt();
            for(int j = 0; j <=Fibonanci; j++ ){             
                int f = j;
                int f2 = f + j ;
                System.out.print(f + "\t");
            }
        input.close();
    }
}
