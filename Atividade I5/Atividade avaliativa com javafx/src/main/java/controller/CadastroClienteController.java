package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class CadastroClienteController implements Initializable{

    private Stage stageCadastro;
    RadioButton botaoSexo;
    ToggleGroup tgSexo = new ToggleGroup();
   
    RadioButton botaoPortador;
    ToggleGroup tgPortador = new ToggleGroup();
    
    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btnFechar;

    @FXML
    private ComboBox<String> cbEstadoCivil;

    @FXML
    private RadioButton rbNao;

    @FXML
    private RadioButton rbSim;

    @FXML
    private RadioButton rbFem;

    @FXML
    private RadioButton rbMasc;

    @FXML
    private RadioButton rbOutro;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtRM;

    @FXML
    void onClickbtnCadastrar(ActionEvent event) {
        String mensagem = "";
        if(!txtCodigo.getText().isEmpty()){
            mensagem = " Codigo: "+ txtCodigo.getText();
        }else{
            mensagem = " Codigo: Nao digitado";
        }
        
        if(!txtNome.getText().isEmpty()){
            mensagem += "\n Nome: "+ txtNome.getText();
        }else{
            mensagem += "\n Nome: Nao digitado";
        }
        
        if(!txtCpf.getText().isEmpty()){
            mensagem += "\n CPF: "+ txtCpf.getText();
        }else{
            mensagem += "\n CPF: Nao digitado";
        }
        
        if(!txtIdade.getText().isEmpty()){
            mensagem += "\n Idade: "+ txtIdade.getText();
        }else{
            mensagem += "\n Idade: Nao digitada";
        }
        
        if(!txtRM.getText().isEmpty()){
            mensagem += "\n Renda Mensal: "+ txtRM.getText();
        }else{
            mensagem += "\n Renda Mensal: Nao digitada";
        }
        
        botaoSexo = (RadioButton)tgSexo.getSelectedToggle();
        mensagem += "\n Sexo: ";
        if(botaoSexo != null){
            mensagem += botaoSexo.getText();
        }else{
            mensagem += ("Nao selecionado");
        }
        botaoPortador = (RadioButton)tgPortador.getSelectedToggle();
        mensagem += "\n Portador de deficiencia: ";
        if(botaoPortador != null){
            mensagem += botaoPortador.getText();
        }else{
            mensagem += ("Nao selecionado");
        }
        
        String EstadoSelecionado = cbEstadoCivil.getValue();
        
        //Alerta de informação
        
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Cadastro");
        alerta.setHeaderText("Cadastro Realizado com Sucesso! ");
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }

    @FXML
    void onClickbtnFechar(ActionEvent event) {
         if(stageCadastro != null){
            stageCadastro.close();
        }
    }

    void setStage(Stage stage) {
        this.stageCadastro = stage;
    }
 @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    void ajustarElementosJanela() {
       tgSexo.getToggles().addAll(rbFem, rbMasc, rbOutro);
       tgPortador.getToggles().addAll(rbSim, rbNao);
       
       cbEstadoCivil.getItems().addAll("Solteiro", "Casado","Divorciado","Viuvo");
       cbEstadoCivil.setValue(" ");
    }
}
