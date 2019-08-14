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
public class ExemploEstruturaCondicao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor");
        int numero = leitor.nextInt();
        if(numero % 2== 0)
            System.out.println("Este número é par!");
        else if(numero % 2 != 0)
            System.out.println("Este número é ímpar!");
        else 
            System.out.println("Não foi possível classificar!");
        
        int opcao = 0;
        System.out.println("1 - Olá Mundo! \n"
                + "         2 - Tchau Mundo! \n "
                + "Digite uma opção:");
        opcao = leitor.nextInt();
        switch(opcao){
            case 1: {
                System.out.println("Olá, Mundo do POO!");
                break;
            }
            case 2: {
                System.out.println("Tchau Mundo, aprendi muito!");
                break;
            }
            default:{
                System.out.println("Opção Inválida!");
            }
        }  
    }
}
