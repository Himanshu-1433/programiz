// Java Program to Find all Roots of a Quadratic Equation
class prog10{
    public static void main(String[] args) {
        // Assume ax*x+bx+c=0; Form of Quadratic Equation
        // let common the x then the formula of the equation is
        // x = -b +- underRoot b*b - 4ac / 2a
        // step1 = [-b]
        // step2 = usderRoot b * b - 4ac
        // step3 = 2a 
        double a = 2.3, b = 4, c = 5.6; ;
        double part1 = -b;
        double part2 = b * b - 4 *  a * c  ;
        double part3 = 2 * a;
        
        // there are three Rules are ahed that is 
        // Rule 1 = if part2 > 0  =  part1 + part2 / part3 ;
        // Rule 1 = if part2 > 0  =  part1 - part2 / part3 ;
        // Rule 2 = if part2 == 0  =  part1 / part3 ;
        // Rule 3 = if part2 < 0  =  part1 / part3 ;
        // Rule 3 = if part2 < 0  =  part2 / part3 ;
        
        double discriminant = part2;

        if(discriminant > 0)
        {
            System.out.println("The discriminant > 0");
            double combination1 = part1 +Math.sqrt(discriminant) / part3;
            double combination2 = part1 -Math.sqrt(discriminant) / part3;
            System.out.format("Answer1 = %.2f Answer2 = %.2f", combination1 , combination2);            
        }
        else if(discriminant == 0){
            System.out.println("The discriminant == 0");
            double combination1 = part1 / part3;
            double combination2 = discriminant;
            System.out.format("Answer1 = %.2f Answer2 = %.2f", combination1 , combination2);            
        }
        else if(discriminant < 0){
            System.out.println("The discriminant < 0");
            double combination1 = part1 / part3;
            double combination2 = (Math.sqrt(-discriminant)) / part3;
            System.out.format("Answer1 = %.2f Answer2 = %.2f", combination1 , combination2);            
        }

    }
}