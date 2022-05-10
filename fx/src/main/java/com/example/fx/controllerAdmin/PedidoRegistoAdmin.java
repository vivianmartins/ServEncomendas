package com.example.fx.controllerAdmin;

import com.example.fx.loginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class PedidoRegistoAdmin {

    @FXML
    private Button btnRegistar;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private SplitMenuButton codpostal;

    @FXML
    private TextField localidade;

    @FXML
    private TextField morada;

    @FXML
    private TextField morada1;

    @FXML
    private TextField nome;

    @FXML
    private TextField nomeEstafeta;

    @FXML
    private TextField quantidade;

    @FXML
    private TextField telefone;

    @FXML
    void edMorada(ActionEvent event) {

    }

    @FXML
    void edTelefone(ActionEvent event) {

    }

    @FXML
    void editNo(ActionEvent event) {

    }

    @FXML
    void edlocalidade(ActionEvent event) {

    }

    @FXML
    void handleBtnRegistar(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registo");
        alert.setHeaderText("Registo efetuado com sucesso!");
        alert.show();
    }

    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/pedidosAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

    @FXML
    void nomeEstafeta(ActionEvent event) {

    }

    @FXML
    void quantidade(ActionEvent event) throws IOException {

    }

}
