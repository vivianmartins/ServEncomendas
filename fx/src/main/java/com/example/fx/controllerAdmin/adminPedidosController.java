package com.example.fx.controllerAdmin;

import com.bd.BLL.EncomendaBLL;
import com.bd.DAL.Pratos;
import com.bd.DAL.listaPedidos;
import com.example.fx.loginController;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class adminPedidosController implements Initializable {


    @FXML
    private Button btnEditar;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnNew;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TableColumn<listaPedidos,Integer> Qtd;

    @FXML
    private TableColumn<listaPedidos, String> data;

    @FXML
    private TableColumn<listaPedidos, String> descricao;

    @FXML
    private TableColumn <listaPedidos, Integer> estado;

    @FXML
    private TableColumn<listaPedidos, Integer> nCliente;

    @FXML
    private TableColumn<listaPedidos, Integer> nPedido;

    @FXML
    private TableColumn<listaPedidos, Integer> noEstafeta;

    @FXML
    private TableColumn<listaPedidos, Float> valor;

    @FXML
    void handleBtnEditar(ActionEvent event) {

    }

    @FXML
    void handleBtnLogout(ActionEvent event) {

    }

    @FXML
    void handleBtnNew(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/pedidoRegistoAdmin.fxml"));
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

        ObservableList<listaPedidos> listaPed = FXCollections.observableArrayList(EncomendaBLL.readAll());

            descricao.setCellValueFactory(new PropertyValueFactory<Pratos,String>("descricao"));
            stock.setCellValueFactory(new PropertyValueFactory<Pratos,Float>("stockdoses"));
            valor.setCellValueFactory(new PropertyValueFactory<Pratos,Float>("precoatual"));
            tblEmenta.setItems(listaPratos);


    }
}
