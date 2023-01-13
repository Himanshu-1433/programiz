package package_After10; 
// Java Program to Check Leap Year


import java.util.Scanner;

class prog11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your starting start");
        int starting_year = input.nextInt();
        
        System.out.println("Enter your Ending Year");
        int end_year = input.nextInt();
        for(int start = starting_year; start<=end_year;start++){
            if(start % 4 == 0 ){
                if(start % 100 == 0){
                    if(start % 400 == 0){
                        System.out.println(start+" is leap ");
                    }
                    else{
                        System.out.println(start+" not leap");
                    }
                }
                else{
                    System.out.println(start+" is leap");
                }
            }
            else{
                System.out.println(start+" is not leap");
            }
        }
        input.close();
    }
}
