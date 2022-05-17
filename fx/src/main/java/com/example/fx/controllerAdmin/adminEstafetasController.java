package com.example.fx.controllerAdmin;

import com.example.bd.BLL.EncomendaBLL;
import com.example.bd.BLL.EstafetaBLL;
import com.example.bd.BLL.UsersBLL;
import com.example.bd.DAL.Encomendas;
import com.example.bd.DAL.Estafeta;
import com.example.bd.DAL.Users;
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
    private TableColumn<Estafeta, String> email;

    @FXML
    private TableColumn<Estafeta, Number> nif;

    @FXML
    private TableColumn<Estafeta, String> nome;

    @FXML
    private TableColumn<Users, String> password;

    @FXML
    private TableColumn<Estafeta, String> telefone;

    @FXML
    private TableView<Estafeta> tblEstafeta;




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

        ObservableList<Estafeta> listaEst = FXCollections.observableArrayList(EstafetaBLL.readAll());
        ObservableList<Users> listaus = FXCollections.observableArrayList(UsersBLL.readAll());
        //UsersBLL users = new UsersBLL();
        nome.setCellValueFactory(new PropertyValueFactory<Estafeta,String>("nome"));
        email.setCellValueFactory(new PropertyValueFactory<Estafeta,String>("email"));
        password.setCellValueFactory(new PropertyValueFactory<Users,String>("password"));
        nif.setCellValueFactory(new PropertyValueFactory<Estafeta, Number>("nif"));
        telefone.setCellValueFactory(new  PropertyValueFactory<Estafeta, String>("numtelefone"));
        tblEstafeta.setItems(listaEst);
    }
}
