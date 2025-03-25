/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aluno
 */
public class ConexaoDB {
    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/lojadb";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "aluno";
    
    public static Connection conectar(){
        try{
            Class.forName(DRIVER_CLASS);
            return DriverManager.getConnection(URL_MYSQL, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException e){
            e.getMessage();
        }
        return null;
    }
    
    public void desconectar(Connection conexao){
        try{
            conexao.close();
        }catch(SQLException e){
            e.getMenssage();
        }
    }
}
