package com.example.fx.controllerAdmin;


import com.example.bd.BLL.ClienteBLL;
import com.example.bd.BLL.UsersBLL;
import com.example.bd.DAL.Clientes;
import com.example.bd.DAL.Users;
import com.example.fx.controllerAdmin.adminClRegistoController;
import com.example.fx.loginController;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class adminClientesController implements Initializable {

    @FXML
    private TableColumn<TableClientAdmin, String> Encomendas;

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
    private TableColumn<TableClientAdmin,String> codigopostal;

        @FXML
    private TableColumn<TableClientAdmin, String> morada;

    @FXML
    private TableColumn<TableClientAdmin, String> nome;

    @FXML
    private TableColumn<TableClientAdmin, String> password;

    @FXML
    private TableColumn<TableClientAdmin,String> telefone;

    ObservableList<TableClientAdmin> oblist = FXCollections.observableArrayList();

    @FXML
    void clhandleBtnRemover(ActionEvent event) {

    }

    @FXML
    void handleBtnCriarCl(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/clienteregistoAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
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

        List<Clientes> cli = null;
        cli = ClienteBLL.readAll();

   }




}
