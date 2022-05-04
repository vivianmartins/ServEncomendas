package com.example.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class paginaadmincontroller {

    /**
     * ESTAFETA
     * */
    @FXML
    private Button btnestafeta;
    /*Mudar pagina*/
    @FXML
    void handleBtnEstafeta(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root =  FXMLLoader.load(getClass().getResource("../fx/estafeta.fxml")); //mudar para a pagina do admin

        stage.setScene(new Scene(root));
        stage.show();

        //Permite abrir a nova pagina e fechar a atual
        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

}
