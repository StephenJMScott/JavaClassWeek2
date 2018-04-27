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
public class StringConcat {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String firstName = "", lastName = "";
        
        System.out.println("Hello, what's your first name?");
        firstName = sc.nextLine();
        
        System.out.println("And your last name?");
        lastName = sc.nextLine();
        
        System.out.println("Hello there " +firstName + " " + lastName + "!");
        
    }
    
    
}
