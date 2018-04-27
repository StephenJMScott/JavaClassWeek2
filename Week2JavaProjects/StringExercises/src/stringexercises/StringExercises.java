/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexercises;

/**
 *
 * @author SwDev16
 *List of string exercises from Moodle
*/
public class StringExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String h = "Hello", a="abc";
        
        System.out.println("The lenght of h is " + h.length());
        System.out.println("The substring between (2,3) is " + h.substring(2,3));
        System.out.println("The substring at position 1 is " + h.substring(1));
        System.out.println("The string in uppercase is " +h.toUpperCase());
        System.out.println("The string toUppercase.toLowerCase is " + h.toUpperCase().toLowerCase());
        System.out.println("h.indexOf(\"H\") is " + h.indexOf("H"));
        System.out.println("h.indexOf(\"h\") is " + h.indexOf("h")+ " because its case sensitive");
        System.out.println("Tomorrow".indexOf("o") + "is the index of \"o\" in the word Tomorrow");
        System.out.println("Tomorrow".lastIndexOf("o")+ "is the index of the last \"o\" in the word Tomorrow");
        System.out.println("Tomorrow".length()*h.length() + "is the lenght of the word Tomorrow multiplied by the lenght of the string h");
        System.out.println(a.length() +a + " is a.length() +a");
        System.out.println(h.substring(0,h.length())+" is h.substring(0,h.length())");
        
        String alpha = " The quick fox jumps over the lazy dog ";
        int foxPos = alpha.indexOf("fox");
        int dogPos = alpha.indexOf("dog");
        
        System.out.println(alpha.charAt(12));
        System.out.println(alpha.length());
        System.out.println(alpha.substring(1));
        System.out.println(alpha.trim().length());
        
        
        
    }
    
}
