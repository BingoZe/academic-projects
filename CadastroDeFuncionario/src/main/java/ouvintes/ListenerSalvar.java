/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.DAOFuncionarios;

/**
 *
 * @author mathe
 */
public class ListenerSalvar implements ActionListener{
    private JTextField nome;
    private JTextField rg;
    private JTextField cpf;
    private JTextField cargo;
    
    public ListenerSalvar(JTextField nome, JTextField rg, JTextField cpf, JTextField cargo){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.cargo = cargo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
    
        DAOFuncionarios dao = DAOFuncionarios.getInstance();
        
        dao.save(nome.getText(),rg.getText(),cpf.getText(),cargo.getText());
        String msg = "Salvo!";
        System.out.print(msg);
        
        
    }
    
    
    
}
