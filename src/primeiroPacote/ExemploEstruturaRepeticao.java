/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroPacote;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class ExemploEstruturaRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor para a tabuada:");
        int numero = leitor.nextInt();
        for(int i=0; i<=10;i++){
            System.out.println(numero+ " * "+ i + " = "+ numero*i);
        }
        int i=1;
        while(i<=10){
            float resultado = numero/i;
            System.out.println(numero+ " / "+ i + " = "+ resultado);
            i++;
        }
        i=0;
        do{
           System.out.println(numero+ " + "+ i + " = "+ (numero+i));
           i++;
        }while(i<=10);
    }
}
