package controllers;

import dal.ConexaoBD;
import java.sql.Connection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    
    private Stage stageLogin;

    private Connection conexão;
    @FXML
    private Button btnFechar;

    @FXML
    private Button btnLogar;

    @FXML
    private Label lblContectBD;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;

    @FXML
    void onClickFechar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void oncClickLogar(ActionEvent event) {

    }
    
    public void setStage(Stage stage){
        this.stageLogin = stage;
    }
    
  
    
    public void verificarBanco(){
        this.conexão = ConexaoBD.conectar();
        if(this.conexão != null){
            System.out.println("Conectou no banco de dados com sucesso");
        }else{
            System.out.println("Deu probleminha viu");
        }
    }
    
    public void abrirJanela(){
        verificarBanco();
    }
}
