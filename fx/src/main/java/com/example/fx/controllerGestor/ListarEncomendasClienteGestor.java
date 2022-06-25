package com.example.fx.controllerGestor;

import com.bd.BLL.ClienteBLL;
import com.bd.BLL.EncomendaBLL;
import com.bd.DAL.listaPedidos;
import com.example.fx.loginController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;

public class ListarEncomendasClienteGestor implements Initializable {
    //public int selectID;
    @FXML
    private TableColumn<listaPedidos, Integer> Qtd;

    @FXML
    private TableColumn<listaPedidos, String> data;

    @FXML
    private TableColumn<listaPedidos, String> descricao;

    @FXML
    private TableColumn<listaPedidos, Integer> estado;

    @FXML
    private TableColumn<listaPedidos, Integer> nCliente;

    @FXML
    private TableColumn<listaPedidos, Integer> nPedido;

    @FXML
    private TableColumn<listaPedidos, Integer> noEstafeta;

    @FXML
    private TableColumn<listaPedidos, Float> valor;

    @FXML
    private TableView<listaPedidos> tblEncomendas;


    @FXML
    private TableColumn<listaPedidos, String> tipoPag;


    @FXML
    private TextField textNIF;

    public void handleTipopag(TableColumn.CellEditEvent cellEditEvent) {
    }

    public void handleBtnLogout(ActionEvent actionEvent) {
    }

    public void handleBtnCancelados(ActionEvent actionEvent) {
        tblEncomendas.getItems().clear();
        int id = ClienteBLL.readByNif2(BigInteger.valueOf(Integer.parseInt(textNIF.getText())));
        ObservableList<listaPedidos> listaPed = FXCollections.observableArrayList(EncomendaBLL.readAllClientesCanceladas(id));

        descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        estado.setCellValueFactory(new PropertyValueFactory<>("encomendaestados"));
        nPedido.setCellValueFactory(new PropertyValueFactory<>("id_encomenda"));
        nCliente.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));
        noEstafeta.setCellValueFactory(new PropertyValueFactory<>("id_estafeta"));
        valor.setCellValueFactory(new PropertyValueFactory<>("precodose"));
        data.setCellValueFactory(new PropertyValueFactory<>("data"));
        Qtd.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        tipoPag.setCellValueFactory(new PropertyValueFactory<>("tp"));

        tblEncomendas.setItems(listaPed);
    }

    public void handleBtnMarcados(ActionEvent actionEvent) {
        tblEncomendas.getItems().clear();
        int id = ClienteBLL.readByNif2(BigInteger.valueOf(Integer.parseInt(textNIF.getText())));
        ObservableList<listaPedidos> listaPed = FXCollections.observableArrayList(EncomendaBLL.readAllClientesMarcadas(id));

        descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        estado.setCellValueFactory(new PropertyValueFactory<>("encomendaestados"));
        nPedido.setCellValueFactory(new PropertyValueFactory<>("id_encomenda"));
        nCliente.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));
        noEstafeta.setCellValueFactory(new PropertyValueFactory<>("id_estafeta"));
        valor.setCellValueFactory(new PropertyValueFactory<>("precodose"));
        data.setCellValueFactory(new PropertyValueFactory<>("data"));
        Qtd.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        tipoPag.setCellValueFactory(new PropertyValueFactory<>("tp"));

        tblEncomendas.setItems(listaPed);
    }

    public void handleBtnConcluidos(ActionEvent actionEvent) {
        tblEncomendas.getItems().clear();
        int id = ClienteBLL.readByNif2(BigInteger.valueOf(Integer.parseInt(textNIF.getText())));
        ObservableList<listaPedidos> listaPed = FXCollections.observableArrayList(EncomendaBLL.readAllClientesConcluidas(id));

        descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        estado.setCellValueFactory(new PropertyValueFactory<>("encomendaestados"));
        nPedido.setCellValueFactory(new PropertyValueFactory<>("id_encomenda"));
        nCliente.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));
        noEstafeta.setCellValueFactory(new PropertyValueFactory<>("id_estafeta"));
        valor.setCellValueFactory(new PropertyValueFactory<>("precodose"));
        data.setCellValueFactory(new PropertyValueFactory<>("data"));
        Qtd.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        tipoPag.setCellValueFactory(new PropertyValueFactory<>("tp"));

        tblEncomendas.setItems(listaPed);
    }

    public void handleBtnEntregues(ActionEvent event) {
        tblEncomendas.getItems().clear();
        int id = ClienteBLL.readByNif2(BigInteger.valueOf(Integer.parseInt(textNIF.getText())));
        ObservableList<listaPedidos> listaPed = FXCollections.observableArrayList(EncomendaBLL.readAllClientesEntregues(id));

        descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        estado.setCellValueFactory(new PropertyValueFactory<>("encomendaestados"));
        nPedido.setCellValueFactory(new PropertyValueFactory<>("id_encomenda"));
        nCliente.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));
        noEstafeta.setCellValueFactory(new PropertyValueFactory<>("id_estafeta"));
        valor.setCellValueFactory(new PropertyValueFactory<>("precodose"));
        data.setCellValueFactory(new PropertyValueFactory<>("data"));
        Qtd.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        tipoPag.setCellValueFactory(new PropertyValueFactory<>("tp"));

        tblEncomendas.setItems(listaPed);
    }

    public void handlbtnPagos(ActionEvent event) {
        tblEncomendas.getItems().clear();
        int id = ClienteBLL.readByNif2(BigInteger.valueOf(Integer.parseInt(textNIF.getText())));
        ObservableList<listaPedidos> listaPed = FXCollections.observableArrayList(EncomendaBLL.readAllClientesPagas(id));

        descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        estado.setCellValueFactory(new PropertyValueFactory<>("encomendaestados"));
        nPedido.setCellValueFactory(new PropertyValueFactory<>("id_encomenda"));
        nCliente.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));
        noEstafeta.setCellValueFactory(new PropertyValueFactory<>("id_estafeta"));
        valor.setCellValueFactory(new PropertyValueFactory<>("precodose"));
        data.setCellValueFactory(new PropertyValueFactory<>("data"));
        Qtd.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        tipoPag.setCellValueFactory(new PropertyValueFactory<>("tp"));

        tblEncomendas.setItems(listaPed);
    }

    public void handleBtnPagamento(ActionEvent actionEvent) {
        tblEncomendas.getSelectionModel().getSelectedItem().getId_encomenda();


    }

    public void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("gestor/clientePedidosGestor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 600);
        stage.setScene(scene);
        stage.show();


        Node source = (Node) event.getSource();
        Stage stageAtual = (Stage) source.getScene().getWindow();
        stageAtual.close();
    }

    public void handleBtnPesquisar(ActionEvent actionEvent) {
        //TODO
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void handleVer(ActionEvent event) {
        if (textNIF.getText() == null) {
            //TODO
        }
        int id = ClienteBLL.readByNif2(BigInteger.valueOf(Integer.parseInt(textNIF.getText())));
        ObservableList<listaPedidos> listaPed = FXCollections.observableArrayList(EncomendaBLL.readAllEncomendasCliente(id));

        descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        estado.setCellValueFactory(new PropertyValueFactory<>("encomendaestados"));
        nPedido.setCellValueFactory(new PropertyValueFactory<>("id_encomenda"));
        nCliente.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));
        noEstafeta.setCellValueFactory(new PropertyValueFactory<>("id_estafeta"));
        valor.setCellValueFactory(new PropertyValueFactory<>("precodose"));
        data.setCellValueFactory(new PropertyValueFactory<>("data"));
        Qtd.setCellValueFactory(new PropertyValueFactory<>("qtd"));
        tipoPag.setCellValueFactory(new PropertyValueFactory<>("tp"));

        tblEncomendas.setItems(listaPed);
    }



}
