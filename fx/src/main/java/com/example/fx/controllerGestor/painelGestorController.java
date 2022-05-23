package com.example.fx.controllerGestor;

import com.bd.BLL.ClienteBLL;
import com.bd.DAL.Clientes;
import com.bd.DAL.Users;
import com.example.fx.controllerAdmin.TableClientAdmin;
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
import java.util.List;
import java.util.ResourceBundle;

public class painelGestorController implements Initializable {

    private List<Clientes> clisteList = ClienteBLL.readAll();

    ObservableList<Clientes> listaCl = FXCollections.observableArrayList(ClienteBLL.readAll());

    @FXML
    private TableColumn<TableClientAdmin, String> Encomendas;

    @FXML
    private Button btnEditarCl;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private Button btncriarCl;

    @FXML
    private TableColumn<Clientes,String> codigopostal;

    @FXML
    private TableColumn<Clientes, Number> id;

    @FXML
    private TableColumn<Clientes, String> morada;

    @FXML
    private TableColumn<Clientes, String> nome;

    @FXML
    private TableColumn<Clientes, Number> nif;

    @FXML
    private TableColumn<Clientes,String> telefone;




    @FXML
    void handleBtnCriarCl(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("gestor/painelGestor.fxml"));
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
    private TableView<Clientes> tblCliente;



    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {

        Users user = new Users();

        if (user.isAdmin()) {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/paginaprincipaladmin.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 960, 600);
            stage.setScene(scene);
            stage.show();

            Node source = (Node) event.getSource();
            Stage stageAtual = (Stage) source.getScene().getWindow();
            stageAtual.close();
        }


    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {


        id.setCellValueFactory(new PropertyValueFactory<Clientes,Number>("ID_CLIENTE"));
        nome.setCellValueFactory(new PropertyValueFactory<Clientes,String>("nome"));
        morada.setCellValueFactory(new PropertyValueFactory<Clientes,String>("rua"));
        codigopostal.setCellValueFactory(new PropertyValueFactory<Clientes,String>("codpostal"));
        telefone.setCellValueFactory(new PropertyValueFactory<Clientes,String>("numtelemovel"));
        nif.setCellValueFactory(new PropertyValueFactory<Clientes,Number>("nif"));

        tblCliente.setItems(listaCl);

    }


}
