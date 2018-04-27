/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassapplications1;

/**
 *
 * @author SwDev16
 */
import java.util.Scanner;
public class JavaClassApplications1 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String strInch = "0", strCent = "0"; 
       float fltInch = 0, fltCent = 0;
    
       System.out.println("Please enter the measurement in inches");
       strInch = sc.nextLine();
    
       try{
           fltInch = Float.parseFloat(strInch);			
           fltCent = fltInch*(2.54F);      System.out.println("That is " + fltCent +"cm!");
    
        }catch(NumberFormatException NFe) {
            System.out.println("Not a number, try again");
        
        }
    }
}
