package com.example.fx.controllerAdmin;

import com.example.fx.loginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class adminClientesController {

    @FXML
    private TableColumn<?, ?> Encomendas;

    @FXML
    private Button btnEditarCl;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnRemoverCl;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private Button btncriarCl;

    @FXML
    private TableColumn<?, ?> codigopostal;

    @FXML
    private TableColumn<?, ?> email;

    @FXML
    private TableColumn<?, ?> morada;

    @FXML
    private TableColumn<?, ?> nome;

    @FXML
    private TableColumn<?, ?> password;

    @FXML
    private TableColumn<?, ?> telefone;

    @FXML
    void clhandleBtnRemover(ActionEvent event) {

    }

    @FXML
    void handleBtnCriarCl(ActionEvent event) {

    }

    @FXML
    void handleBtnEditarCl(ActionEvent event) {

    }

    @FXML
    void handleBtnLogout(ActionEvent event) {

    }

    @FXML
    void handleBtnPesquisar(ActionEvent event) {

    }

    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("paginaprincipaladmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
    }

}
