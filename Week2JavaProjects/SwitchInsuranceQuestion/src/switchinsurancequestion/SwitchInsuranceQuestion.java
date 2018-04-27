/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchinsurancequestion;

/**
 *
 * @author SwDev16 26/04/2018
 * Write a program that asks the user to 1. Enter their age and 2. enter the years
 * they have a no claims bonus. 
 * The Full Rate is 1000, if age is less than 25 they always pay full rate. Beside
 * that they get a 10% discount for every years no claim bonus. 
 */
import java.util.Scanner;
public class SwitchInsuranceQuestion {

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
        
        if(age<25){
            System.out.println("Your premium will be "+ FULLRATE);
            
        }else{
            switch(years){
                case 1: System.out.println("Your premium will be "+ FULLRATE*.9);
                        break;
                case 2:  System.out.println("Your premium will be "+ FULLRATE*.8);
                        break;
                case 3: System.out.println("Your premium will be "+ FULLRATE*.7);
                        break;
                case 4:  System.out.println("Your premium will be "+ FULLRATE*.6);
                        break;
                case 5:  System.out.println("Your premium will be "+ FULLRATE*.5);
                        break;
                default : System.out.println("Invalid input");
            }
        }
    }
    
}
