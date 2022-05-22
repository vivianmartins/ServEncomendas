package com.example.fx.controllerAdmin;


import com.example.bd.BLL.PratoBLL;

import com.example.bd.DAL.Pratos;
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

public class adminEmentaControlller implements Initializable {

    private List<Pratos> pList = PratoBLL.readAll();
    ObservableList<Pratos> listaPratos = FXCollections.observableArrayList(PratoBLL.readAll());


    @FXML
    private Button btnEditar;

    @FXML
    private Button btnLogout;


    @FXML
    private Button btnCriar;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnRemover;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TableColumn<Pratos, String > descricao;

    @FXML
    private TableColumn<Pratos, Float> stock;

    @FXML
    private TableColumn<Pratos, Float> valor;

    @FXML
    void desc(ActionEvent event) {

    }

    @FXML
    void handleBtnEditar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/ementaEditarAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

    @FXML
    void handleBtnLogout(ActionEvent event) {

    }

    @FXML
    void handleBtnCriar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/ementaRegistoAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 668 , 407);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

    @FXML
    void handleBtnPesquisar(ActionEvent event) {


    }

    /*
    **  Remover os dados da ementa.
     */
    @FXML
    void handleBtnRemover(ActionEvent event) {
         Pratos ementas = tblEmenta.getSelectionModel().getSelectedItem();
         int id = ementas.getIdPrato(); //nome dado ao fazer select
         pList.remove(id); //remove das definições
         PratoBLL.delete(id); //remove pelo BLL
         tblEmenta.setItems(listaPratos); //permite listar novamente
    }
    @FXML
    private TableView<Pratos> tblEmenta;


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

    @FXML
    void stock(ActionEvent event) {

    }

    @FXML
    void valor(ActionEvent event) {

    }
        /*
        ** Listar os dados ao abrir a pagina
        */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //  ObservableList<Pratos> listaPratos = FXCollections.observableArrayList(PratoBLL.readAll());
        //UsersBLL users = new UsersBLL();
         descricao.setCellValueFactory(new PropertyValueFactory<Pratos,String>("descricao"));
         stock.setCellValueFactory(new PropertyValueFactory<Pratos,Float>("stockdoses"));
         valor.setCellValueFactory(new PropertyValueFactory<Pratos,Float>("precoatual"));
         tblEmenta.setItems(listaPratos);

    }


}
