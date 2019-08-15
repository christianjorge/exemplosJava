/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author chris
 */
public class Pizza {
    public int tamanhoCM;
    public String nome;
    public float valor;
    public int fatias;
    
    public Pizza(){
        tamanhoCM = 0;
        nome = "";
        valor = 0;
        fatias = 0;
    }
    public Pizza(int tamanhoCM, String nome, float valor, int fatias){
        this.tamanhoCM = tamanhoCM;
        this.nome = nome;
        this.valor = valor;
        this.fatias = fatias;
    }
    public float calcularValorPorFatia(){
        return this.valor/this.fatias;
    }
    public void montarCardapio(){
        System.out.println(this.nome
            + " - "+this.tamanhoCM
            +"cm ("+ this.fatias
            +" fatias) -------------- R$ "+ this.valor+" (cada fatia sai à R$ "+this.calcularValorPorFatia()+").");
    }
}
