package com.example.fx.controllerAdmin;

import com.example.fx.loginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EstafetaregistoAdmin {

    @FXML
    private Button btnRegistar;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private SplitMenuButton codpostal;

    @FXML
    private TextField email;

    @FXML
    private TextField localidade;

    @FXML
    private TextField morada;

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

    @FXML
    void edMorada(ActionEvent event) {

    }

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
    void edlocalidade(ActionEvent event) {

    }

    @FXML
    void handleBtnRegistar(ActionEvent event) {

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

}
