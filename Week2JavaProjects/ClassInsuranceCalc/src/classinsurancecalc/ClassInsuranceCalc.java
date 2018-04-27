/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classinsurancecalc;

/**
 *
 * @author SwDev16
 * Write a program called Insurance Calculator which accepts the users age from the user
 * if the user is under 18 or over 80 it tells them we can't quote them
 * if the user is between 18 and 25 tell them full premium €1000
 * if the user is over 26 and 40 give them full premium with 10%discount
 */
import java.util.Scanner;
public class ClassInsuranceCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strAge = " ";
        int intAge = 0;
        final int intFullPremium = 1000;
        
        System.out.println("Please enter your age for a quote");
        strAge = sc.nextLine();
        
        try{
            intAge = Integer.parseInt(strAge);
            
            if(intAge<18 || intAge>80){
                System.out.println("Sorry, we cannot quote you");
            }else if (intAge>18 && intAge <=25){
                System.out.println("We can quote you €" + intFullPremium);
            }else if (intAge>25 && intAge<40){
                System.out.println("We can quote you €" + intFullPremium*.9);
            }else{
                System.out.println("Please call us for a detailed quote");
            }
        }catch(NumberFormatException NFe){
            System.out.println("Please enter your age in digits");
        }
        
    }
    
}
