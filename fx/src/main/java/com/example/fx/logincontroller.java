package com.example.fx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class logincontroller {
    private Label welcomeText;

    @FXML
    private Button btnIniciar;

    @FXML
    private TextField lblEmail;

    @FXML
    private PasswordField lblPassword;

    @FXML
    void handleBtnIniciar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root =  FXMLLoader.load(getClass().getResource("paginaprincipaladmin.fxml"));

        stage.setScene(new Scene(root));


        stage.show();

        Node  source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

    @FXML
    void handleLblEmail(ActionEvent event) {

    }

    @FXML
    void handleLblPassword(ActionEvent event) {

    }

}
