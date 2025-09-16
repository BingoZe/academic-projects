/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telas;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import models.DAOTeste;



/**
 *
 * @author mathe
 */
public class TelaPrincipal extends JFrame{
    private JPanel panel;
    private JPanel painel_botoes;
    
    private JButton bt_novo;
    private JButton bt_deletar;
    private JButton bt_sair;
    
    private JLabel label_title;
    
    //definindo o menu
    
    private JMenuBar b_menu;
    private JMenu menu_programa;
    
    private JMenuItem item_cadastro;
    private JMenuItem item_sair;
    
    
    
    
    public void initialize(){
        bt_novo = new JButton ("Novo");
        bt_deletar = new JButton("Deletar");
        bt_sair = new JButton("Sair");
        
        label_title = new JLabel("Pagina principal");
        
        panel = new JPanel();
        painel_botoes = new JPanel();
        
        //menu
        
        b_menu = new JMenuBar();
        menu_programa = new JMenu("Programa");
        item_cadastro = new JMenuItem("Cadastrar teste");
        item_sair = new JMenuItem("Sair");
        
       menu_programa.add(item_cadastro);
       menu_programa.addSeparator();
       menu_programa.add(item_sair);
       
       b_menu.add(menu_programa);
       
       this.setJMenuBar(b_menu); //seta o menu
       
       
       //acoes do menu
       
       item_cadastro.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           TelaTeste d = new TelaTeste();
       }
       
       
       });
       
       item_sair.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           setVisible(false);
           dispose();
           System.exit(0);
       }
       
       
       });
        
        //layout do painel
        panel.setLayout(new BorderLayout(5,5));
        
        this.setBounds(0,0,500,300);
        this.setPreferredSize(new Dimension(500,300));
        
        panel.add(label_title, BorderLayout.PAGE_START);
        
        painel_botoes.setLayout(new GridLayout(6,1,10,10));
        
        //listener para o botao sair
        
        bt_novo.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ex){
               TelaTeste c = new TelaTeste();
           }
            
            
        });
        
        
        bt_sair.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               setVisible(false);
               dispose();
               System.exit(0);
           }
            
        });
        
        painel_botoes.add(bt_novo);
        painel_botoes.add(bt_deletar);
        painel_botoes.add(bt_sair);
        
        panel.add(painel_botoes, BorderLayout.LINE_END);
        
        this.add(panel);
        this.pack();
        
        this.setTitle("Pagina Principal");
        
        this.setVisible(true);
        
        this.setLocationRelativeTo(null);

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public TelaPrincipal(){
        DAOTeste dao = DAOTeste.getInstance();
        this.initialize();
        this.setExtendedState(NORMAL);
    }
    
    
}
