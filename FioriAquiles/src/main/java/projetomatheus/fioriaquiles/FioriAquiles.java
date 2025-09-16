/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projetomatheus.fioriaquiles;
import java.util.Scanner;


import projetomatheus.fioriaquiles.entidades.Usuario;
/**
 *
 * @author mathe
 */
public class FioriAquiles {

    public static void main(String[] args) {
        Usuario cliente = new Usuario();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do usuario: ");
        String nomeUsuario = scanner.next();
        cliente.setUsername(nomeUsuario);
        
        System.out.print("\nEmail do usuario: ");
        String emailUsuario = scanner.next();
        cliente.setEmail(emailUsuario);
        
        System.out.print("\nPassword: ");
        String password = scanner.next();
        cliente.setPassword(password);
        
        System.out.print("\nTipo de conta: ");
        int tipoConta = scanner.nextInt();
        cliente.setTipoConta(tipoConta);
                
        System.out.print("Dados: "+cliente.getUsername()+" "+cliente.getEmail()+" "+cliente.getPassword()+" "+cliente.getTipoConta());
        

    }
}
