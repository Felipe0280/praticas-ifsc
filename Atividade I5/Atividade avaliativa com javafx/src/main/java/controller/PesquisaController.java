package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PesquisaController {
    
    private Stage stagePesquisa;
    RadioButton botaoLinguagensSelecionado;
    ToggleGroup tgLinguagens = new ToggleGroup();
    
    ToggleButton botaoSOSelecionado;
    ToggleGroup tgSistemaOperacional = new ToggleGroup();

    @FXML
    private Button btnSubmeterPesquisa;
    
    @FXML
    private Button btnFechar;

    @FXML
    private CheckBox chkGostaProgramar;

    @FXML
    private CheckBox chkProgramaTodosDias;

    @FXML
    private RadioButton rbC;

    @FXML
    private RadioButton rbJava;

    @FXML
    private RadioButton rbPython;

    @FXML
    private ToggleButton tbLinux;

    @FXML
    private ToggleButton tbMac;

    @FXML
    private ToggleButton tbWindows;

    @FXML
    private TextField txtNomeCompleto;
    
    @FXML
    private ComboBox<String> cbIDe;

    @FXML
    void onClickBtnSubmeterPesquisa(ActionEvent event) {
        System.out.println("\n\n");
        if(!txtNomeCompleto.getText().isEmpty()){
            System.out.println("Nome completo: " +
                    txtNomeCompleto.getText());
        }
        
        botaoSOSelecionado = (ToggleButton) 
                tgSistemaOperacional.getSelectedToggle();
        System.out.print("Sistema operacional selecionado: ");
        System.out.println(botaoSOSelecionado == null ? 
                "Nao selecionado" : botaoSOSelecionado.getText());
        
        botaoLinguagensSelecionado = (RadioButton) 
                tgLinguagens.getSelectedToggle();
        System.out.print("Linguagem de programacao preferida: ");
        if(botaoLinguagensSelecionado != null){
            System.out.println(botaoLinguagensSelecionado.getText());
        }else{
            System.out.println("Nao selecionado");
        }
        
        System.out.print("Programa todo dia? ");
        System.out.println(chkProgramaTodosDias.isSelected() == true ? "Sim" : "Nao");
       
        System.out.print("Gosta de programar? ");
        if(chkGostaProgramar.isSelected()){
            System.out.println("Sim");
        } else{
            System.out.println("Nao");
        }
        
        String IDEusada = cbIDe.getValue();
        System.out.println("IDE utilizada: "+IDEusada);
       
        String mensagem = "" ;
        mensagem += "Nome completo: " + txtNomeCompleto.getText();
        mensagem += "\n Sistema operacional utilizado: " + botaoSOSelecionado.getText();
        mensagem += "\n Linguagem de programaçao preferida: "+ botaoLinguagensSelecionado.getText();
        mensagem += "\n Programa todo dia: "+ (chkProgramaTodosDias.isSelected() == true ? "Sim" : "Nao"); 
        mensagem += "\n Gosta de programar: "+ (chkGostaProgramar.isSelected()== true ? "Sim" : "Nao");
        mensagem += "\n IDE usada: "+cbIDe.getValue() ;
        
        
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Pesquisa");
        alerta.setHeaderText("Pesquisa submetida");
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
    
    @FXML
    void onClickBtnFechar(ActionEvent event) {
        if(stagePesquisa != null){
            stagePesquisa.close();
        }
    }

    void setStage(Stage novaTela) {
        this.stagePesquisa = novaTela;
    }

    void ajustarElementosJanela(){
        tgLinguagens.getToggles().addAll(rbJava, rbPython, rbC);
        //diferente do primeiro
        tbWindows.setToggleGroup(tgSistemaOperacional);
        tbLinux.setToggleGroup(tgSistemaOperacional);
        tbMac.setToggleGroup(tgSistemaOperacional);
        
        cbIDe.getItems().addAll("NetBeans (a pior)", "Eclipse (a melhor)",("InteliJ"));
        cbIDe.setValue(" ");
    }
}
