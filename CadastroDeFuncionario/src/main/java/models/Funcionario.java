/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author mathe
 */
public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String cargo;
    
    public Funcionario (String nome, String cpf, String rg, String cargo){
        this.nome=nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
    }
    public Funcionario(String nome,String cpf, String rg, String cargo,int id){
        this.nome = nome;
        this.cpf=cpf;
        this.rg= rg;
        this.cargo = cargo;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return this.nome;
    }
    
}
