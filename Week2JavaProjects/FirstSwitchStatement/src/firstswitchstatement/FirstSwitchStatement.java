/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstswitchstatement;

/**
 *
 * @author SwDev16
 * creating a menu using Switch Statements in class 25/04/2018
 */
import java.util.Scanner;
public class FirstSwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intNumSelected;
        char charOptionSelecter;
        String strSelecter
        
        System.out.println("Please make a selection! \n"
                + "1.Burger \n"
                + "2.Chips \n"
                + "3.Nuggets \n"
                + "4.Pizza");
//        intNumSelected = sc.nextInt();
//        charOptionSelecter = sc.next().toLowerCase().charAt(0);
          strSelecter = sc.next().toLowerCase();
        
//        switch(intNumSelected){
//        switch(charOptionSelecter){
          switch(strSelecter){
        
            case "burger": System.out.println("You selected a Burger");
                    break;
            case "chips": System.out.println("You selected Chips");
                    break;
            case "nuggets": System.out.println("You selected some Nuggets");
                    break;
            case "pizza": System.out.println("You selected a pizza");
                    break;
            
            default: System.out.println("Invalid Selection");
        }
    }
    
}
