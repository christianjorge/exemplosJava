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
public class Carro {
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public float potencia;
    
    public Carro(){
        potencia = 0;
        marca = "";
        modelo = "";
        cor = "";
        ano = 0;
    }
    public Carro(float potencia, int ano, String marca, String cor, String modelo){
        this.potencia = potencia;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public int calcularIdade(){
        return 2019 - this.ano;
    }
    public void mostrarCarro(){
        System.out.println("Modelo: "+ this.modelo
            + "\n Marca: "+ this.marca
            +"\n Cor: "+ this.cor
            +"\n Potência: "+ this.potencia
            +"\n Ano: "+ this.ano
            +"\n Idade: "+ this.calcularIdade());
    }
}
