/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projetomatheus.ex3.aula3;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Ex3Aula3 {

    public static void main(String[] args) {
        String nome;
        Object [] teams = {"Palmeiras, Corinthians","São Paulo","Santos","Flamengo","Fluminense","Botafogo","Vasco","Cruzeiro","Atletico","Gremio","Internacional","Outro","Nao torce"};
        
        String resposta1, resposta2;
        
        
        resposta1= (String) JOptionPane.showInputDialog(null,"Qual seu nome?","Por favor",JOptionPane.QUESTION_MESSAGE);
        nome = resposta1;
        
        
        resposta2= (String) JOptionPane.showInputDialog(null,"Qual seu time?","Por favor",JOptionPane.QUESTION_MESSAGE,null, teams, teams[2]);
             
        JOption.showMessageDialog(null, "O torcedor(a) "+nome+" torce para o "+resposta2);
    }
}
