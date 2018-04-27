/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurancequestionfull;

/**
 *
 * @author SwDev16
 * Taking the switch and nested if insurance question and cleaning it up. Input as string, try catch conversion ect
 * Full premium is 1500 and applied to everyone under 25, 25s and over get a 10% discount each year of no claims bonus up to five years.
 * It is illegal to drive under the age of 16. 
 */
import java.util.Scanner;
public class InsuranceQuestionFull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strAge = " ", strYears = " ";
        int intAge = 0, intYears = 0;
        final double FULLRATE = 1500;
        
        do{
            System.out.println("Please enter your age to begin the quote. Enter \"q\" at anytime to quit.");
            strAge = sc.nextLine();
            
            System.out.println("Please enter your years no years bonus to see if there is a discount available. Enter \"q\" at anytime to quit.");
            strYears = sc.nextLine();
            
            try{
                if(!strAge.matches("Q|q")| !strYears.matches("Q|q")){
                    intAge = Integer.parseInt(strAge);
                    intYears = Integer.parseInt(strYears);
                    
                }
            }catch(NumberFormatException NFe){
                System.out.println("Try again with numbers please.");
            }
            
            
        }while (!strAge.matches("Q|q")| !strYears.matches("Q|q"));
    }
    
}
