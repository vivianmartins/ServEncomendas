package com.example.fx.controllerAdmin;

import com.bd.BLL.EstafetaBLL;
import com.bd.BLL.UsersBLL;
import com.bd.DAL.Estafetas;
import com.bd.DAL.Users;
import com.example.fx.loginController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminEstafetasController implements Initializable {

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnNew;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnRemover;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TableColumn<Estafetas, String> email;

    @FXML
    private TableColumn<Estafetas, Number> nif;

    @FXML
    private TableColumn<Estafetas, String> nome;

    @FXML
    private TableColumn<Estafetas, String> password;

    @FXML
    private TableColumn<Estafetas, String> telefone;

    @FXML
    private TableView<Estafetas> tblEstafeta;




    @FXML
    void handleBtnEditar(ActionEvent event) {


    }

    @FXML
    void handleBtnLogout(ActionEvent event) {

    }

    @FXML
    void handleBtnNew(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/estafetaregistoAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();


    }

    @FXML
    void handleBtnPesquisar(ActionEvent event) {

    }

    @FXML
    void handleBtnRemover(ActionEvent event) {

    }

    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/paginaprincipaladmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        ObservableList<Estafetas> listaEst = FXCollections.observableArrayList(EstafetaBLL.readAll());

        nome.setCellValueFactory(new PropertyValueFactory<Estafetas, String>("nome"));
        email.setCellValueFactory(new PropertyValueFactory<Estafetas, String>("email"));
        password.setCellValueFactory(new PropertyValueFactory<Estafetas, String>("password"));
        nif.setCellValueFactory(new PropertyValueFactory<Estafetas, Number>("nif"));
        telefone.setCellValueFactory(new PropertyValueFactory<Estafetas, String>("telefone"));
        tblEstafeta.setItems(listaEst);

        // EstafetaBLL est = new EstafetaBLL();
        //UsersBLL users = new UsersBLL();
/*
         for ( var es : EstafetaBLL.readAll()){
                for ( var users : UsersBLL.readAll() ){
                    if(es.g == users.getIdUser())
                        es.
                }


         }
         }
 */
    }
}
