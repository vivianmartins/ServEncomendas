package com.example.fx.controllerAdmin;

import com.bd.BLL.ClienteBLL;
import com.bd.BLL.CodPostaisBLL;
import com.bd.BLL.EstafetaBLL;
import com.bd.BLL.UsersBLL;
import com.bd.DAL.Codpostais;
import com.bd.DAL.Estafeta;
import com.bd.DAL.Users;
import com.example.fx.loginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;

public class EstafetaregistoAdmin {

    @FXML
    private Button btnRegistar;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TextField codpostal;

    @FXML
    private TextField email;

    @FXML
    private TextField localidade;



    @FXML
    private TextField nif;

    @FXML
    private TextField nome;

    @FXML
    private TextField passe;

    @FXML
    private TextField telefone;

    @FXML
    private TextField username;

    @FXML
    void edEmail(ActionEvent event) {

    }

  //  @FXML
    //void edMorada(ActionEvent event) {
//    }

    @FXML
    void edNif(ActionEvent event) {

    }

    @FXML
    void edPasse(ActionEvent event) {

    }

    @FXML
    void edTelefone(ActionEvent event) {

    }

    @FXML
    void edUsername(ActionEvent event) {

    }

    @FXML
    void editNo(ActionEvent event) {

    }

    @FXML
    void edcodpostal (ActionEvent event) {

    }

    @FXML
    void edlocalidade(ActionEvent event) {

    }

    @FXML
    void handleBtnRegistar(ActionEvent event) {


        if (isInputValid()) {

            {

                Estafeta est = new Estafeta();
                Codpostais codpostais = new Codpostais();
                est.setEmail(email.getText());
                est.setNumtelefone(telefone.getText());
                est.setNome(nome.getText());
                est.setNif(Integer.parseInt(nif.getText()));
                est.setPassword(passe.getText());
                est.setEstado(true);
                codpostais.setLocalidade(localidade.getText());
                //colocar o codpostal
                codpostais.setCodpostal(Integer.parseInt(codpostal.getText()));

                EstafetaBLL.create(est);
                CodPostaisBLL.create(codpostais);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Registo");
                alert.setHeaderText("Registo efetuado com sucesso!");
                alert.show();
            }
        }
    }

    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/estafetasAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();


    }



    public boolean isInputValid(){


        String errorMessage = "";

        if (nome.getText().isEmpty() || nome.getText().length() == 0) {
            errorMessage += "Email inválido!\n";
        }

        if (username.getText() == null || username.getText().length() == 0) {
            errorMessage += "Username iniválida!\n";
        }
        if (passe.getText() == null || passe.getText().length() == 0) {
            errorMessage += "Passe inválida!\n";
        }

        if(EstafetaBLL.emailRepetidoEstafeta(email.getText())){
            errorMessage += "Email  já existe!\n";
        }

        if(EstafetaBLL.emailRepetidoEstafetaNif(Integer.parseInt(nif.getText()))){
            errorMessage += "Nif já existe!\n";
        }




        if (errorMessage.length() == 0 ) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Campos inválidos");
            alert.setHeaderText("Preencha corretamente os campos!");
            alert.setContentText(errorMessage);
            alert.showAndWait();
            return false;
        }

    }

}
