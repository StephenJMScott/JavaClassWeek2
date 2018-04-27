/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testif;

/**
 *
 * @author SwDev16
 * Week 2 Folder Branching Exercises document. 
 */
import java.util.Scanner;
public class TestIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strInputA = " ", strInputB = " ";
        Double dblA = 0.0, dblB = 0.0, dblC =0.0;
        Boolean booTrue = True;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please insert number one \n");
        strInputA = sc.nextLine();
        
        System.out.println("Please insert number two \n");
        strInputB = sc.nextLine();
  
            try{
                dblA = Double.parseDouble(strInputA);
                dblB = Double.parseDouble(strInputB);
                
                dblC = largerFunction(dblA, dblB);
                booTrue = evenFunction(dblA);
                
                System.out.println("The largest number is " + dblC);
                if(booTrue = True){
                    System.out.println("The first number is even");
                }else{
                    System.out.println("The first number is odd");
                }
               
                
                
            }catch(NumberFormatException NFe){
                System.out.println("Please only enter numbers");
                
             
            }
        }
    
        public static double largerFunction(double dblOne, double dblTwo){
              double max; 
                
              if (dblOne > dblTwo){
                  max = dblOne;
              } else{
                  max = dblTwo;
              }
              
              return max;
            
        }
        
        public static double evenFunction(double dblEvenOrOdd){
            boolean evenNum = True;
            
            if (dblEvenOrOdd %2!=0){
                evenNum = False;
            }
            return evenNum;
        }
        
        
}
    
       
    
    
