package com.example.fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;
import java.util.Objects;

public class paginaadmincontroller {

    /**
     * ESTAFETA
     * */
    @FXML
    private Button btnEstafeta;;
    /*Mudar pagina*/
    @FXML
    void handleBtnEstafeta(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root =  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("estafetasAdmin.fxml"))); //mudar para a pagina do admin
//fx/src/main/resources/com/example/fx/estafetasAdmin.fxml
        stage.setScene(new Scene(root));

        stage.show();

        //Permite abrir a nova pagina e fechar a atual
        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

}
