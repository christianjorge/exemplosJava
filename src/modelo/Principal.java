/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int opcao = 0;
        System.out.println("Menu de Interações com o código, opções disponíveis:\n"
                        + "1 - Aluno \n"
                        + "2 - Evento \n"
                        + "3 - Livro \n"
                        + "4 - Funcionario \n"
                        + "5 - Disciplina \n"
                        + "6 - Venda \n"
                        + "7 - Animal \n"
                        + "8 - Conta Bancaria \n"
                        + "9 - Pizza \n"
                        + "10 - Carro \n"
                        + " -----------------------------------------\n"
                        + "Digite uma opção:");
        opcao = leitor.nextInt();
        
        switch(opcao){
            case 1: {
                System.out.println("******* Iniciando teste da classe Aluno *******");
                Aluno christian = new Aluno();
                System.out.println("Digite o número de matrícula: ");
                christian.nMatricula = leitor.nextInt();
                System.out.println("Digite o nome:");
                christian.nome = leitor.next();
                System.out.println("Digite o ano de nascimento:");
                christian.anoNascimento = leitor.nextInt();
                System.out.println("Digite o curso: ");
                christian.curso = leitor.next();
                christian.impressaoAluno();
                break;
            }
            case 2: {
                System.out.println("******* Iniciando teste da classe Evento *******");
                break;
            }
            case 3: {
                System.out.println("******* Iniciando teste da classe Livro *******");
                break;
            }
            case 4: {
                System.out.println("******* Iniciando teste da classe Funcionario *******");
                break;
            }
            case 5: {
                System.out.println("******* Iniciando teste da classe Disciplina *******");
                break;
            }
            case 6: {
                System.out.println("******* Iniciando teste da classe Venda *******");
                break;
            }
            case 7: {
                System.out.println("******* Iniciando teste da classe Animal *******");
                break;
            }
            case 8: {
                System.out.println("******* Iniciando teste da classe Conta Bancaria *******");
                break;
            }
            case 9: {
                System.out.println("******* Iniciando teste da classe Pizza *******");
                Pizza pzz1 = new Pizza();
                System.out.println("Digite um nome para a Pizza: ");
                pzz1.nome = leitor.next();
                System.out.println("Digite um tamanho em CM para a pizza:");
                pzz1.tamanhoCM = leitor.nextInt();
                System.out.println("Quantas fatias possue a pizza?");
                pzz1.fatias = leitor.nextInt();
                System.out.println("Digite o valor da pizza: ");
                pzz1.valor = leitor.nextFloat();
                pzz1.montarCardapio();
                break;
            }
            case 10: {
                System.out.println("******* Iniciando teste da classe Carro *******");
                Carro car1 = new Carro();
                System.out.println("Digite o modelo do carro: ");
                car1.modelo = leitor.next();
                System.out.println("Digite a marca do carro:");
                car1.marca = leitor.next();
                System.out.println("Digite a cor do carro: ");
                car1.cor = leitor.next();
                System.out.println("Digite a potência do carro (Ex. 1.4, 2.0): ");
                car1.potencia = leitor.nextFloat();
                System.out.println("Digite o ano do carro:");
                car1.ano = leitor.nextInt();
                car1.mostrarCarro();
                break;
            }
            default:{
                System.out.println("Opção Inválida!");
            }
        }  
        
    }
}
