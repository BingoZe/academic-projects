/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01.dialogo;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Ex01Dialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String resposta;
        int idade;
        
        
        resposta = (String) JOptionPane.showInputDialog(
            null,
                "Digite a sua idade",
                "Por favor",
                JOptionPane.QUESTION_MESSAGE
        );
        
        idade = Integer.parseInt(resposta);
        
        if(idade >=18){
            JOptionPane.showMessageDialog(null, "Voce e maior de idade, ok");
            
        }else {
                    JOptionPane.showMessageDialog(null,"Entrada proibidade","Aviso", JOptionPane.ERROR_MESSAGE);
                    }
    }
    
}
