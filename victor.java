/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author waleed
 */
import java.util.Scanner;
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("how many letters does your first name has?" );
        int lettersoffirstname = Keyboard.nextInt();
        System.out.println(" how many letters does your surname has? ");
        int lattersofsuranme = Keyboard.nextInt();
       int totallettersofbothyoursurnameandfirstname =lettersoffirstname + lattersofsuranme;
       System.out.println("letter of your both surname and first name are "+totallettersofbothyoursurnameandfirstname);
       
       
    }
    
}
