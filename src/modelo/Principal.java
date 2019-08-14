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
        Aluno gean = new Aluno();
        System.out.println("Digite o número de matrícula: ");
        gean.setnMatricula(leitor.nextInt());
        System.out.println("Digite o nome:");
        gean.setNome(leitor.next());
        System.out.println("Digite o ano de nascimento:");
        gean.setAnoNascimento(leitor.nextInt());
        System.out.println("Digite o curso: ");
        gean.setCurso(leitor.next());
        gean.impressaoAluno();
        
        System.out.println("Digite o número de matrícula: ");
        int nMatricula = leitor.nextInt();
        System.out.println("Digite o nome:");
        String nome = leitor.next();
        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = leitor.nextInt();
        System.out.println("Digite o curso: ");
        String curso = leitor.next();
        Aluno wllisses = new Aluno(nMatricula, nome, anoNascimento, curso);
        wllisses.impressaoAluno();
        
    }
}
