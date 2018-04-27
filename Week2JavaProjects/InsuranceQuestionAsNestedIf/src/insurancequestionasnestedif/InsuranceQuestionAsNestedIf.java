/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurancequestionasnestedif;

/**
 *
 * @author SwDev16
 * Write a program that asks the user to 1. Enter their age and 2. enter the years
 * they have a no claims bonus. 
 * The Full Rate is 1000, if age is less than 25 they always pay full rate. Beside
 * that they get a 10% discount for every years no claim bonus. This time with
 * nested if statements
 */
import java.util.Scanner;
public class InsuranceQuestionAsNestedIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       final double FULLRATE = 1000;
       int age = 0, years = 0;
       
        System.out.println("Please enter your age");
        age = sc.nextInt();
        
        System.out.println("Please enter your years no claim bonus. (1-5 years)");
        years = sc.nextInt();
        
        if( age < 16){
            System.out.println("Legally you cannot drive kiddo");
            
        }else if(age < 25 && age >=16){
            System.out.println("Your premium will be "+ FULLRATE);
            
        }else{
            if(years ==1){
                System.out.println("Your premium will be " + FULLRATE*.9);
            }else if (years ==2){
                System.out.println("Your premium will be " + FULLRATE*.8);
            }else if (years ==3){
                System.out.println("Your premium will be " + FULLRATE*.7);
            }else if (years ==4){
                System.out.println("Your premium will be " + FULLRATE*.6);
            }else if (years ==5){
                System.out.println("Your premium will be " + FULLRATE*.5);  
            }else {
                System.out.println("Invalid Selection");
            }
        }
        
    }
    
}
