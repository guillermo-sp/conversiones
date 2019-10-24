/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Introducir un entero no negativo, y convertirlo a binario, octal y hexadecimal.
         */
        Scanner teclado = new Scanner(System.in);
        int resultado;
        int resto;
        String conversion="";
        System.out.println("Introduce por teclado el numero en base 10");
        int n1 = teclado.nextInt();
        do {
            resto=n1%2;
            resultado = n1/2;
            conversion=resto+conversion;
            

        } while (n1 !=1);
        System.out.println(n1+conversion);
    }

}
