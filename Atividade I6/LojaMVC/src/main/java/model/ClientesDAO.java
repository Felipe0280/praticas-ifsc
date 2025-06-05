/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
import java.time.LocalDate;

public class ClientesDAO extends GenericDAO {
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate dataNascimento;
    
    private void inserirClientes(Cliente cliente) throws SQLException{
        String insert = "INSERT INTO cliente(id, nome, telefone, endereco, dataNascimento) VALUES(?,?,?,?,?)";
          save(insert, cliente.getId(),cliente.getNome(),  cliente.getTelefone(), cliente.getEndereco(), cliente.getDataNascimento()); 
        
    }
    
    
    
    
}
