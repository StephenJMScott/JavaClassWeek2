/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex205;

/**
 *
 * @author SwDev16
 */
public class Ex205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double dblPii = 3.14159, dblRadius = 5.5, dblDia = (2*dblRadius), dblCir=0, dblArea =0;
       dblCir = dblPii*dblDia;
       dblArea = dblPii * (dblRadius*dblRadius);
       
        System.out.println("The circumfrence is " + dblCir + " cm, and the area is "+ dblArea + "cm squared");
       
       
       
    }
    
}
