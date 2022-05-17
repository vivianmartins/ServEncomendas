package com.example.fx.controllerAdmin;

import com.example.bd.BLL.CodPostaisBLL;
import com.example.bd.BLL.EstafetaBLL;
import com.example.bd.BLL.UsersBLL;
import com.example.bd.DAL.Codpostais;
import com.example.bd.DAL.Estafeta;
import com.example.bd.DAL.Users;
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



        {

            Estafeta est= new Estafeta();
            Users user = new Users ();
            Codpostais codpostais = new Codpostais();

            est.setEmail(email.getText());
            est.setNumtelefone(telefone.getText());
            est.setNome(nome.getText());
            est.setNif(Integer.parseInt(nif.getText()));
            est.setIdEstafeta(62);
            est.setIdUser(BigInteger.valueOf((62)));
            user.setNomeuser(username.getText());
            user.setEmail(email.getText());
            user.setPassword(passe.getText());
            user.setEstafeta(true);
            codpostais.setLocalidade(localidade.getText());
            //colocar o codpostal
            codpostais.setCodpostal(Integer.parseInt(codpostal.getText()));

            UsersBLL.create(user);
            EstafetaBLL.create(est);
            CodPostaisBLL.create(codpostais);




            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registo");
            alert.setHeaderText("Registo efetuado com sucesso!");
            alert.show();
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

}
