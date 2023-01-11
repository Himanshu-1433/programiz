package package_After10; 
// Java Program to Check Leap Year


import java.util.Scanner;

 class prog11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Year");
        int year = input.nextInt();
        if(year < 9999 || year > 0000)
        {
            if(year % 4 == 0 ){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        System.out.println(year+"leap Year");
                    }
                    else{
                        System.out.println(year+"not leap Year");
                    }
                }
                else{
                    System.out.println(year+"not leap Year");
                }
            }
        }
        input.close();
    }
}
