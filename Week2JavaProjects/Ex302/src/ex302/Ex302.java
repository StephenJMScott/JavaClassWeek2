/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex302;

/**
 *
 * @author SwDev16
 */
import java.util.Scanner;
public class Ex302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       final double carpetPrice = 5.0;
       double lenght=0, width=0, area =0;
       
       
       
        System.out.println("Please enter the lenght:");
        lenght = sc.nextDouble();
        
        System.out.println("Please enter the width:");
        width = sc.nextDouble();
        
        area = lenght*width;
        
        System.out.println("The cost of carpet for that area is €" + area*carpetPrice);
        
        
       
       
    }
    
}
