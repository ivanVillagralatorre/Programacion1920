/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarejer16;

import java.util.regex.*;

/**
 *
 * @author 1gdaw07
 */
public class ValidarEjer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	String cadena = "30/02/2020";
        
        Pattern pat = Pattern.compile("^((0[0-9])|([1-2][0-9])|(3[0-1]))/((0[0-9])|(1[0-2]))/((1[0-9]{3})|(20[0-1][0-9])|(2020))$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches ()) {
            System.out.println("SI");
            } else {
                System.out.println("NO");
                   }

    }
    
}
