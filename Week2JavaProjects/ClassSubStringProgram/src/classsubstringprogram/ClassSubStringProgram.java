/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classsubstringprogram;

/**
 *
 * @author SwDev16
 * Write a program that takes a substring out of a string and outputs it to the console.
 */

public class ClassSubStringProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String dogsName = "My Dog's Name is Snowy", newString=" ";
//        
////        newString = dogsName.substring(3,8);
//        newString = dogsName.replace("Dog", "Cat");
//        System.out.println(newString);
//        System.out.println(dogsName.replace("Dog","Aligator"));
//        
//    }

        String strSentance = "Hello, this is Hell.";
        
        System.out.println(strSentance.replaceAll("\\bHell\\b", "Jell"));
        System.out.println(strSentance.indexOf('z'));
    
}
}