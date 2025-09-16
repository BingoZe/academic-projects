/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomatheus.exercicio2;

/**
 *
 * @author mathe
 */
public class Pintor {
    public String nome_pintor;
    public String cidade;
    public double valor_hora;
    
    public double calcularPagamentoTotal(double horas_trabalhadas){
        return (double) (horas_trabalhadas * this.valor_hora);
    }
    
    public Pintor(){
        
    }
    
    public Pintor(String nome_pintor,String cidade,double valor_hora){
     this.nome_pintor = nome_pintor;
     this.cidade = cidade;
     this.valor_hora = valor_hora;     
    }
     
    
    
}
