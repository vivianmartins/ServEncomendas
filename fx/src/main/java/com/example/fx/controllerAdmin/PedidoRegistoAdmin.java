package com.example.fx.controllerAdmin;

import com.bd.BLL.*;
import com.bd.DAL.*;
import com.example.fx.loginController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;

public class PedidoRegistoAdmin implements Initializable {


    ObservableList<Estadosencomenda> listaEncEst = FXCollections.observableArrayList(EstadosencomendaBLL.readAll());


    ObservableList<Tipopagamentos> listTp = FXCollections.observableArrayList(TipoPagamentoBLL.readAll());



    @FXML
        private Button btnRegistar;

        @FXML
        private Button btnVoltarEs;

        @FXML
        private TextField nif;

        @FXML
        private TextField emailEstafeta;

        @FXML
        private TextField prato;

        @FXML
        private TextField quantidade;


    @FXML
    private TextField prTotal;


    @FXML
        void edPrato(ActionEvent event) {

        }

        @FXML
        private ComboBox<Estadosencomenda> tpEstado ;

        @FXML
        private ComboBox<Tipopagamentos> tpPagamento ;

        @FXML
        void editNif(ActionEvent event) {

        }
        @FXML
        void HandleTpEstado(ActionEvent event) {

        }

        @FXML
        void HandleTpPagamento(ActionEvent event) {


        }




        @FXML
        void emailEstafeta(ActionEvent event) {

        }

        @FXML
        void quantidade(ActionEvent event) {

        }

    @FXML
    void prTotal(ActionEvent event) {

    }


    @FXML
    void handleBtnRegistar(ActionEvent event) {

        Encomendas enc = new Encomendas();
        Clientes cl = new Clientes();
        Pratos pr = new Pratos();
        Estadosencomenda es = new Estadosencomenda();
        Tipopagamentos tp= new Tipopagamentos();
        Estafeta est = new Estafeta();
        PratosEncomendados pre = new PratosEncomendados();


       es.setDescricaoestado(String.valueOf(tpEstado.getSelectionModel().getSelectedItem()));
       tp.setDescricao(String.valueOf(tpPagamento.getSelectionModel().getSelectedItem()));
       cl.setNif(BigInteger.valueOf(Integer.valueOf(nif.getText())));
       pr.setDescricao(prato.getText());
       est.getEmail();
       pre.setQtddoses(Integer.parseInt(quantidade.getText()));
       pr.setPrecoatual(Integer.parseInt(prTotal.getText()));



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registo");
        alert.setHeaderText("Registo efetuado com sucesso!");
        alert.show();
    }

    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/pedidosAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      tpPagamento.setItems(FXCollections.observableArrayList(listTp));
      tpEstado.setItems(FXCollections.observableArrayList(listaEncEst));
    }


}
