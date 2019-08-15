/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Cris
 */
public class Aluno {
    public int nMatricula;
    public String nome;
    public int anoNascimento;
    public String curso;
    
    public Aluno(){
        nMatricula = 0;
        nome = "";
        anoNascimento = 0;
        curso = "";
    }
    public Aluno(int nMatricula, String nome, int anoNascimento, String curso){
        this.nMatricula = nMatricula;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.curso = curso;
    }
    public int calcularIdade(){
        return 2019 - anoNascimento;
    }
    public void impressaoAluno(){
        System.out.println("Aluno: "+ nome
            + "\n Número de matrícula: "+ nMatricula
            +"\n Idade: "+ calcularIdade()
            +"\n pertence ao curso: "+ curso);
    }
}
