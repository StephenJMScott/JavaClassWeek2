/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package javaclassapplications1;

/**
 *
 * @author SwDev16
 */
public class AverageNumber {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in); 
        String strNb1 = "0", strNb2 = "0", strNb3 = "0";
        Float fltTotal = 0F, fltAvg = 0F;

        System.out.println("Please enter number one");
        strNb1 = sc.nextLine();
        System.out.println("Please enter number two");
        strNb2 = sc.nextLine();
        System.out.println("Please enter number three");
        strNb3 = sc.nextLine();

        try{
            fltTotal += Float.parseFloat(strNb1);
            fltTotal += Float.parseFloat(strNb2);
            fltTotal += Float.parseFloat(strNb3);

            fltAvg = fltTotal/3F;


            System.out.println("The total of those three numbers equals " + fltTotal +" and the average of those three numbers is " + fltAvg + ".");

        }catch(NumberFormatException NFe){
            System.out.println("Please only enter numbers, try again");

        }
    }
}
   
