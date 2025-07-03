package controller;

import java.sql.Date;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Cliente;

public class ClienteViewController {

    @FXML
    private Button btnSalvar;

    @FXML
    private TableColumn<Cliente, Date> colData;

    @FXML
    private TableColumn<Cliente, String> colEndereco;

    @FXML
    private TableColumn<Cliente, String> colNome;

    @FXML
    private TableColumn<Cliente, String> colTelefone;

    @FXML
    private TableView<Cliente> tableClientes;

    @FXML
    private DatePicker txtData;

    @FXML
    private TextField txtEndereco;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTelefone;

    
    @FXML
    void btnSalvarOnActionPerformed(ActionEvent event) {
        
        
    }

}
