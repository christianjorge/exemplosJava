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
    private int nMatricula;
    private String nome;
    private int anoNascimento;
    private String curso;
    
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
        return 2019 - getAnoNascimento();
    }
    public void impressaoAluno(){
        System.out.println("Aluno: "+ getNome()
            + "\n Número de matrícula: "+ getnMatricula()
            +"\n Idade: "+ calcularIdade()
            +"\n pertence ao curso: "+ getCurso());
    }

    /**
     * @return the nMatricula
     */
    public int getnMatricula() {
        return nMatricula;
    }

    /**
     * @param nMatricula the nMatricula to set
     */
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
