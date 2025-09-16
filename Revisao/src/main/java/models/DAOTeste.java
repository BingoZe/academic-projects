/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author mathe
 */
public class DAOTeste {
    private Connection conexao;
    private static DAOTeste instancia;
    
    private DAOTeste() {
        
        try{
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String host = "localhost";
            String db = "cad_teste";
            String url ="jdbc:mysql://"+host+"/"+db;
            String user = "root";
            String pwd = "root";
            
            this.conexao = DriverManager.getConnection(url,user,pwd);
            
            if(this.conexao != null){
                System.out.print("Conexao com sucesso");
            } else{
                System.err.print("Deu erro na conexao");
            }
            
            
        } catch(ClassNotFoundException ex){
            System.out.print("Driver nao encontrado");
        }
        catch(SQLException e){
            System.out.print("Erro na conexao");
        }
    
}
    public static DAOTeste getInstance(){
        if(instancia == null){
            instancia = new DAOTeste();
            
        }
        
        return instancia;
    }
    
    
    public void save(String nome, String cargo, String cpf, String telefone){
        try {
            PreparedStatement ps = conexao.prepareStatement(
                    "INSERT INTO teste_cliente (nome,cargo,cpf,telefone) "+"value (?,?,?,?)"
            
            
            );
            
            ps.setString(1,nome);
            ps.setString(2,cargo);
            ps.setString(3,cpf);
            ps.setString(4,telefone);
            
            ps.execute();
        }catch(SQLException ex){
            Logger.getLogger(DAOTeste.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
}
