/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarejer5;

import java.util.regex.*;

/**
 *
 * @author 1gdaw07
 */
public class ValidarEjer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String cadena = "6.5.172.255";
        
        Pattern pat = Pattern.compile("^([0-9]|[0-9]{2}|[0-1][0-9][0-9]|[0-2][0-4][0-9]|[0-2][5][0-5]).([0-9]|[0-9]{2}|[0-1][0-9][0-9]|[0-2][0-4][0-9]|[0-2][5][0-5]).([0-9]|[0-9]{2}|[0-1][0-9][0-9]|[0-2][0-4][0-9]|[0-2][5][0-5]).([0-9]|[0-9]{2}|[0-1][0-9][0-9]|[0-2][0-4][0-9]|[0-2][5][0-5])$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches ()) {
            System.out.println("SI");
            } else {
                System.out.println("NO");
                   }

        
    }
    
}
