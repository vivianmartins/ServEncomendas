package com.example.fx.controllerAdmin;


import com.example.bd.BLL.ClienteBLL;
import com.example.bd.BLL.EncomendaBLL;
import com.example.bd.BLL.PratoBLL;
import com.example.bd.BLL.UsersBLL;
import com.example.bd.DAL.Clientes;
import com.example.bd.DAL.Encomendas;
import com.example.bd.DAL.Pratos;
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
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class adminClientesController implements Initializable {

    private List <Clientes>  cLista = ClienteBLL.readAll();

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
    private Button btnRemoverCl;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private Button btncriarCl;

    @FXML
    private TableColumn<Clientes,String> codigopostal;

    @FXML
    private TableColumn<Encomendas,Number> encomendas;


    @FXML
    private TableColumn<Clientes, String> morada;

    @FXML
    private TableColumn<Clientes, String> nome;

    @FXML
   private TableColumn<Clientes, Number> nif;

    @FXML
    private TableColumn<Clientes,String> telefone;



    @FXML
    void clhandleBtnRemover(ActionEvent event) {


/*
        Clientes cls = tblCliente.getSelectionModel().getSelectedItem();
        int id = cls.getIdCliente(); //nome dado ao fazer select
        cLista.remove(id); //remove das definições
        ClienteBLL.delete(id); //remove pelo BLL
        tblCliente.setItems(listaCl); //permite listar novamente

        //  pseudo remover ---- volta a aparecer

        int selectedID = tblCliente.getSelectionModel().getSelectedIndex();
        tblCliente.getItems().remove(selectedID);
        ClienteBLL.delete(selectedID);
        tblCliente.setItems(listaCl);


        /------------------
 Clientes cls = tblCliente.getSelectionModel().getSelectedItem();
        int id = cls.getIdCliente()
        clisteList.remove(id);
        ClienteBLL.delete(id);
        tblCliente.setItems(listaCl);

*/
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
    private TableView<Clientes> tblCliente;



    ObservableList<Clientes> listasCl = FXCollections.observableArrayList();
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



        ObservableList<Encomendas> listaEn = FXCollections.observableArrayList(EncomendaBLL.readAll());
        //UsersBLL users = new UsersBLL();
        nome.setCellValueFactory(new PropertyValueFactory<Clientes,String>("nome"));
        morada.setCellValueFactory(new PropertyValueFactory<Clientes,String>("rua"));
        codigopostal.setCellValueFactory(new PropertyValueFactory<Clientes,String>("codpostal"));
        telefone.setCellValueFactory(new PropertyValueFactory<Clientes,String>("numtelemovel"));
        nif.setCellValueFactory(new PropertyValueFactory<Clientes,Number>("nif"));
        encomendas.setCellValueFactory(new PropertyValueFactory<Encomendas,Number>("id_encomenda"));
       
        tblCliente.setItems(listaCl);

   }



}
