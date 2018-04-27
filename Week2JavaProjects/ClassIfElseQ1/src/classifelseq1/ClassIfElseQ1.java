/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifelseq1;

/**
 *
 * @author SwDev16
 * Write a program that asks the user to enter their exam result. If the result is greater than or equal to 80%
 * its a distinction. If its between 65 and 80% its a merit. 
 */
import java.util.Scanner;
public class ClassIfElseQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strResult = " ";
        int intResult = 0;
        
        System.out.println("Please enter your result: \n");
        strResult = sc.nextLine();
        
        try{
            intResult = Integer.parseInt(strResult);
            if(intResult>=80 && intResult <=100){
                System.out.println("Distinction");
            }else if (intResult <80 && intResult>=65){
                System.out.println("Merit");
            }else if (intResult<65 && intResult >=40){
                System.out.println("Pass");
            }else if (intResult <40 && intResult >=0){
                System.out.println("Fail");
            }else{
                System.out.println("Invalid Result Entry");
            }
        }catch(NumberFormatException NFe){
            System.out.println("Please only enter digits, try again");
        }
        
    }
    
}
