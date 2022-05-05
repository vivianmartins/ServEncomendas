package com.example.fx;
import com.example.bd.BLL.UsersBLL;
import com.example.bd.DAL.Users;
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
import java.util.Objects;

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

        Users user = null;
        user =UsersBLL.login(lblEmail.getText(),lblPassword.getText());
        if(user.isAdmin()){
            Parent root =  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("paginaprincipaladmin.fxml"))); //mudar para a pagina do admin
            stage.setScene(new Scene(root));
            stage.show();

            Node  source = (Node)  event.getSource();
            Stage stageAtual  = (Stage) source.getScene().getWindow();
            stageAtual.close();
        }

        if(user.isEstafeta()){
            Parent root =  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("estafeta.fxml"))); //mudar para a pagina do admin
            stage.setScene(new Scene(root));
            stage.show();

            Node  source = (Node)  event.getSource();
            Stage stageAtual  = (Stage) source.getScene().getWindow();
            stageAtual.close();
        }
        //if(user.isCozinheiro(){


       // }

        //if(user.isGestor()){

       // }




        //Permite abrir a nova pagina e fechar a atual


    }

    @FXML
    void handleLblEmail(ActionEvent event) {

    }

    @FXML
    void handleLblPassword(ActionEvent event) {

    }

}
