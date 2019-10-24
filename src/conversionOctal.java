
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario DAM 1
 */
public class conversionOctal {
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
            resto=n1%8;
            resultado = n1/8;
            conversion=resto+conversion;
            

        } while (n1>7);
        System.out.println(n1+conversion);
    
    }
}
