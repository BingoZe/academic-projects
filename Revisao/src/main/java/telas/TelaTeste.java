/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import ouvintes.ListenerSalvar;



/**
 *
 * @author mathe
 */
public class TelaTeste  extends JFrame {
    
    private JPanel panel;
    
    private JLabel label_nome;
    private JLabel label_cargo;
    private JLabel label_cpf;
    private JLabel label_telefone;
    
    private JTextField text_nome;
    private JTextField text_cargo;
    private JTextField text_cpf;
    private JTextField text_telefone;
    
    private JButton confirmar;
    private JButton sair;
    
  
    
    
    public void initialize(){
        panel = new JPanel();
        
        GridLayout ly = new GridLayout(5,2,10,10);
        panel.setLayout(ly);
        
        //inicializa cada um dos atributos
        label_nome = new JLabel("Nome: ");
        label_cargo = new JLabel("Cargo: ");
        label_cpf = new JLabel("CPF: ");
        label_telefone = new JLabel("Telefone: ");
        
        text_nome = new JTextField();
        text_cargo = new JTextField();
        text_cpf = new JTextField();
        text_telefone = new JTextField();
    
        confirmar = new JButton("Confirmar");
        sair = new JButton("Sair");
        
        //adiciona ao painel
        panel.add(label_nome);
        panel.add(text_nome);
        
        panel.add(label_cpf);
        panel.add(text_cpf);        
        
        panel.add(label_cargo);
        panel.add(text_cargo);
        
        panel.add(label_telefone);
        panel.add(text_telefone);
        
        panel.add(confirmar);
        panel.add(sair);
        
        //adicionar listener ao botao confirmar
        
        confirmar.addActionListener(new ListenerSalvar(text_nome, text_cpf,text_cargo,text_telefone));
        
        sair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                dispose();

            }
        });
        
   
        
        this.setBounds(0,0,400,200);
        
        this.add(panel);
        
        this.setPreferredSize(new Dimension(400,200));
        
        this.setTitle("Janela teste");
        
        this.pack();
        
        this.setVisible(true);
        
        this.setLocationRelativeTo(null);
        
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
              
    
}
    
    public TelaTeste() {
        
        this.initialize();
        this.setExtendedState(NORMAL);
    
}


    
}
