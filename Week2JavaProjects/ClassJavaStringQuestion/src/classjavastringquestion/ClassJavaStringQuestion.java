/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classjavastringquestion;

/**
 *
 * @author SwDev16
 * Write a program that asks the user to enter their 1st name and output the length of their name
 * convert the name to UPPERCASE
 * output the second character of the name
 */

import java.util.Scanner;
public class ClassJavaStringQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strName= " ", strUpperCaseName=" ", strSurName= " ", strFullName= " ";
        char charSecond = 'a';
        int intName = 0;
        
        do{
            System.out.println("Please enter your first name");
            strName = sc.nextLine();
            System.out.println("And what is your surname?");
            strSurName = sc.nextLine();
            
          
               
            intName = strName.length();
            strUpperCaseName = strName.toUpperCase();
            charSecond = strName.charAt(1);
            strFullName = strName.concat(" "+strSurName);
                    


            System.out.println("Your first name contains " + intName + " letters");
            System.out.println(strUpperCaseName + ", I AM SHOUTING");
            System.out.println(charSecond + "  is the second letter of your name ya know");
            System.out.println("Well, see you " + strFullName);
              
            break;
            
            
        }while(!strName.isEmpty() && !strSurName.isEmpty());
                

       
        
        
        
        
        
    }
    
}
