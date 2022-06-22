package com.example.fx.controllerCozinheiro;

import com.bd.BLL.PratosEncomendadosBLL;
import com.bd.DAL.PratosEncomendados;
import com.bd.DAL.listaPedidosCozinheiro;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class pedidoCozinheiro implements Initializable {

    ObservableList<listaPedidosCozinheiro> listPeCoz = FXCollections.observableArrayList(PratosEncomendadosBLL.reAllCoz(true));

    @FXML
    private Button btnAtualizar;

    @FXML
    private Button btnEditarCoz;

    @FXML
    private Button btnVoltar;

    @FXML
    private TableColumn<listaPedidosCozinheiro, String> descricao;
   // private TableColumn<PratosEncomendados, Number> descricao;

    @FXML
    private TextField edStockCoz;



    @FXML
    private TableColumn<listaPedidosCozinheiro, Number> npedido;

    @FXML
    private TableColumn<listaPedidosCozinheiro, Number> quantidade;

    @FXML
    private TableView<listaPedidosCozinheiro> tblPedidosCoz;

    @FXML
    void descricao(ActionEvent event) {

    }

    @FXML
    void edStockCoz(ActionEvent event) {

    }

    @FXML
    void estado(ActionEvent event) {

    }

    @FXML
    void handleBtnAtualizar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("cozinheiro/pedidoCozinheiro.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1025 , 641);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();


    }

    @FXML
    void handleBtnEditarCoz(ActionEvent event) {

      // ObservableList<listaPedidosCozinheiro> selectedRows;
        //selectedRows =   tblPedidosCoz.getSelectionModel().getSelectedItems();
        //tblPedidosCoz.getItems().remove(selectedRows);


        listaPedidosCozinheiro listCoz = tblPedidosCoz.getSelectionModel().getSelectedItem();
        tblPedidosCoz.getItems();
        int id = listCoz.getId_encomenda();
        listCoz.setEstado(false);
       // PratosEncomendadosBLL.update(listCoz);




    }

    @FXML
    void handleBtnVoltar(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("cozinheiro/painelcozi.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1025 , 641);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
    }

    @FXML
    void npedido(ActionEvent event) {

    }

    @FXML
    void quantidade(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


            descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
            npedido.setCellValueFactory(new PropertyValueFactory<>("id_encomenda"));
            quantidade.setCellValueFactory(new PropertyValueFactory<>("qtd"));
            tblPedidosCoz.setItems(listPeCoz);


        }

    }

