/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 1
 */
public class ConersionesExadecimal {

    public static void main(String[] args) {
        int numero = 27;
        int resto = 0;
        String letra = "";
        String conversion="";
        while (numero > 15) {
            resto = numero % 16;
            numero = numero / 16;

            if (resto > 9) {
                switch (resto) {
                    case 10:
                        letra="A";
                        break;
                    case 11:
                        letra="B";
                        break;
                    case 12:
                        letra="C";
                        break;
                    case 13:
                        letra="D";
                        break;
                    case 14:
                        letra="E";
                        break;
                    case 15:
                        letra="F";
                        break;
                }
                
                conversion = letra+conversion;
            } else {
                conversion = numero+conversion;
            }
     
        }
        
        conversion=numero+conversion;
        System.out.println(conversion);
    }

}
