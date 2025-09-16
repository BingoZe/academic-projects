/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ouvintes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.DAOTeste;



/**
 *
 * @author mathe
 */
public class ListenerSalvar implements ActionListener{
    
    private JTextField nome;
    private JTextField cargo;
    private JTextField cpf;
    private JTextField telefone;
    
    public ListenerSalvar(JTextField nome, JTextField cargo, JTextField cpf, JTextField telefone){
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        DAOTeste teste = DAOTeste.getInstance();
        
        teste.save(nome.getText(),cargo.getText(),cpf.getText(),telefone.getText());
        
                
        JOptionPane.showMessageDialog(null,"Salvo com sucesso");
    }
    
}
