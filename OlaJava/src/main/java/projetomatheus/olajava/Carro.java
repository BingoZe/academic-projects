/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomatheus.olajava;

/**
 *
 * @author mathe
 */
public class Carro {
    
    public String placa;
    public String cor;
    public String nome;
    public int numeroChassi;
    public double valor;
    
    public void print(){
        System.out.print("Placa: " + placa+"\n");
        System.out.print("Cor :" +cor+"\n");
        System.out.print("Nome: "+nome+"\n");
        System.out.print("Numero do chassi: "+numeroChassi+"\n");
    }
    
    public double ipva(){
     double taxa;
     if(valor <=5000.00){
        taxa = valor *0.02;
     }else{
        taxa = valor *0.03;
     }
     return taxa;
    }
    
    public Carro(String nome, String cor, String placa, int numeroChassi){
        this.nome = nome;
        this.cor = cor;
        this.placa = placa;
        this.numeroChassi = numeroChassi;
    }
    
      
}