/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifquestion1;

/**
 *
 * @author SwDev16
 * Write a program that asks the user for their age. 
 * If the age entered is greater than 60 output "you are close to retirement age"
 */
import java.util.Scanner;
public class ClassIfQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String strAge = " ";
        int intAge = 0;
        
        System.out.println("Please input your age!");
        strAge = sc.nextLine();
        
        try{
        intAge = Integer.parseInt(strAge);
        
        if(intAge >= 60 && intAge<=70){
            System.out.println("You are close to retirement age!");
            
        }
        else if(intAge >=50 && intAge <60){
            System.out.println("You are due a crisis");
        }
        else if(intAge >=40 && intAge <40){
            System.out.println("You are in the middle of your working life ");
        }
        else if(intAge >=30 && intAge <40){
            System.out.println("You are working a while now!");
        }
        else if(intAge >=20 && intAge <30){
            System.out.println("You are a milenial so probably broke!");
        }
        else {
            System.out.println("Enjoy the freedom.");
        }
        }catch(NumberFormatException NFe) {
        System.out.println("Not a number, try again");
        }
            
        }
        
        
    }
    

