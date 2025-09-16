/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telas;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ouvintes.ListenerSalvar;


/**
 *
 * @author mathe
 */
public class TelaCadastro extends JDialog{
    
    //atributos
    private JPanel panel;
    
    //elementos da tela
    private JLabel label_cpf;
    private JLabel label_rg;
    private JLabel label_nome;
    private JLabel label_cargo;
        
    private JTextField text_cpf;
    private JTextField text_rg;
    private JTextField text_nome;
    private JTextField text_cargo;
        
    private JButton bt_ok;
    private JButton bt_cancela;
        
    
        public TelaCadastro(){
        this.initialize();
        this.setModal(true);
        this.setAlwaysOnTop(true);
    }
    
    //inicializacao da tela    
    public void initialize(){
        panel = new JPanel();//cria uma janela
        
        //grid layout
        GridLayout gl = new GridLayout(5,2,10,10);
        panel.setLayout(gl);
       
        //elementos da tela
        this.setBounds(0,0,400,200);//define posicao inicial e tamanho
        
        //inicializacao
        label_cpf = new JLabel("CPF: ");
        label_rg = new JLabel("RG: ");
        label_nome = new JLabel("Nome: ");
        label_cargo = new JLabel("Cargo: ");
        
        text_cpf = new JTextField();
        text_rg = new JTextField();
        text_nome = new JTextField();
        text_cargo = new JTextField();
        
        bt_ok = new JButton("OK");
        bt_cancela = new JButton("Cancela");
        
        //configuracao
        
        //evento de clique
        bt_ok.addActionListener(new ListenerSalvar(text_nome,text_rg,text_cpf,text_cargo));
        bt_cancela.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    setVisible(false);
                    dispose();
                    
                }
    });
        
        //adicionar ao painel
        panel.add(label_nome);
        panel.add(text_nome);
        panel.add(label_cpf);
        panel.add(text_cpf);
        panel.add(label_rg);
        panel.add(text_rg);
        panel.add(label_cargo);
        panel.add(text_cargo);
        panel.add(bt_ok);
        panel.add(bt_cancela);
        
        
        
        this.add(panel);//adiciona o panel no Frame
        
        this.setPreferredSize(new Dimension(400,200));//define o tamanho padrao da janela
        
        this.setTitle("Cadastro de funcionario");//define o titulo da janela
        this.pack();//faz a compactacao da janela, deixando-a pronta pra uso
        
        this.setVisible(true);//exibe a janela
        this.setLocationRelativeTo(null);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//define comportamento ao fechar a janela
        
    } 
    

    
}
