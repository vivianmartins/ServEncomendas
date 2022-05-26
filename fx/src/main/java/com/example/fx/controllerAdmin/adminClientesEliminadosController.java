package com.example.fx.controllerAdmin;

import com.bd.BLL.ClienteBLL;
import com.bd.DAL.Clientes;
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

public class adminClientesEliminadosController implements Initializable {



    ObservableList<Clientes> listaCls = FXCollections.observableArrayList(ClienteBLL.readAll(false));


    @FXML
    private Button btnClEli;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TableColumn<Clientes,String> codigopostalCl;

    @FXML
    private TableColumn<Clientes, Number> idCl;

    @FXML
    private TableColumn<Clientes, String> moradaCl;

    @FXML
    private TableColumn<Clientes, String> nomeCl;

    @FXML
    private TableColumn<Clientes, Number> nifCl;

    @FXML
    private TableColumn<Clientes,String> telefoneCl;
    @FXML
    private TableView<Clientes> tblClienteEli;




    @FXML
    void handleBtnClEli(ActionEvent event) {
        Clientes cl = tblClienteEli.getSelectionModel().getSelectedItem();
        tblClienteEli.getItems();
        int id = cl.getIdCliente();
        cl.setEstado(true);
        ClienteBLL.updateT(cl);



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
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/clientesAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {


        idCl.setCellValueFactory(new PropertyValueFactory<Clientes,Number>("IdCliente"));
        nomeCl.setCellValueFactory(new PropertyValueFactory<Clientes,String>("nome"));
        moradaCl.setCellValueFactory(new PropertyValueFactory<Clientes,String>("rua"));
        codigopostalCl.setCellValueFactory(new PropertyValueFactory<Clientes,String>("codpostal"));
        telefoneCl.setCellValueFactory(new PropertyValueFactory<Clientes,String>("numtelemovel"));
        nifCl.setCellValueFactory(new PropertyValueFactory<Clientes,Number>("nif"));
        tblClienteEli.setItems(listaCls);

    }

}
