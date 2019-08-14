package primeiroPacote;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class MinhaPrimeiraClasse { 
    public static void main(String[] args) {
        System.out.println("Olá, Mundo");
        int x = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento");
        int anoNasc = leitor.nextInt();
        int idade = 2019 - anoNasc;
        System.out.println("Sua idade é: "+ idade + " anos");
    }
}
