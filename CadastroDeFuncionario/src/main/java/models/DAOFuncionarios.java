/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author mathe
 */
public class DAOFuncionarios {
    private Connection conexao;
    private static DAOFuncionarios instancia;
    
    private DAOFuncionarios (){
        try {
            //tenta carregar o drive
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            //se nao carregar, vair cair na linha do ClassNotFound
            
            //parametros de conexao ao banco
            String host = "localhost";
            String db = "cad_locadora";
            String url = "jdbc:mysql://"+host+"/"+db;
            String user = "root";
            String pwd = "root";
            
            this.conexao = DriverManager.getConnection(url,user,pwd);
            
            //teste
            if(this.conexao != null){
                System.out.print("Sucesso na Conexao com o BD!");
            } else {
                System.err.print("Erro no BD");
            }
        } catch(ClassNotFoundException e){
            //aqui quer dizer que o driver nao foi encontrado
            System.out.print("O driver nao foi encontrado");
        } catch(SQLException e){
            System.err.print("Nao foi possivel conectar-se ao banco");
        }
    }
    
    public static DAOFuncionarios getInstance(){
        if(instancia == null){
            instancia = new DAOFuncionarios();
        }
        return instancia;        
    }
    
    public void save(String nome, String rg, String cpf, String cargo){
        try {
            PreparedStatement ps = conexao.prepareStatement(
                    "INSERT INTO funcionarios(nome,rg,cpf,cargo)"+"VALUES(?,?,?,?)"            
            );
            ps.setString(1,nome);
            ps.setString(2,rg);
            ps.setString(3,cpf);
            ps.setString(4,cargo);
            
            ps.execute();
            
        } catch(SQLException ex){
            Logger.getLogger(DAOFuncionarios.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public DefaultListModel<Funcionario> list(){
        DefaultListModel<Funcionario> model = new DefaultListModel<>();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(
                    "Select * FROM funcionarios"
            );
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                model.addElement(new Funcionario(
                rs.getString("nome"),
                rs.getString("cpf"),
                rs.getString("rg"),
                rs.getString("cargo"),
                rs.getInt("id")
                ));
            }
            return model;
        } catch(SQLException ex){
            Logger.getLogger(DAOFuncionarios.class.getName()).log(Level.SEVERE,null,ex);
            }
            return null;
        }
    }
    
