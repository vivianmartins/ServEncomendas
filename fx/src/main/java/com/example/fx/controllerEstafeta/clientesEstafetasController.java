package com.example.fx.controllerEstafeta;

import com.example.bd.DAL.Clientes;
import com.example.bd.BLL.ClienteBLL;
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
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.util.logging.Level;
import javax.persistence.*;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class clientesEstafetasController implements Initializable {


    @FXML
    private Button btnLogout;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnVoltarEs;

    //@FXML
    //private TableColumn<Clientes, Integer> codigopostal;

    @FXML
    private TableColumn<Clientes, String> morada;

    @FXML
    private TableColumn<Clientes, String> nome;

    @FXML
    private TableColumn<Clientes, String> telefone;
    @FXML
    public TableView<Clientes> CltableView ;


      //  final  ObservableList<Clientes> cli = FXCollections.observableArrayList(listaCl);

    @FXML
    void handleBtnLogout(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node) event.getSource();
        Stage stageAtual = (Stage) source.getScene().getWindow();
        stageAtual.close();



    }
    @FXML
    void handleBtnPesquisar(ActionEvent event) {

    }

    @FXML
    void handleBtnVoltarEs(ActionEvent event) throws IOException {
        Node  source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }

    public void initialize(URL url, ResourceBundle rb) {


      /*  ClienteBLL listaCl =  new ClienteBLL();
        nome.setCellValueFactory(new PropertyValueFactory<Clientes, String>("nome"));
        codigopostal.setCellValueFactory(new PropertyValueFactory<Clientes,Integer>("codpostal"));
        morada.setCellValueFactory(new PropertyValueFactory<Clientes,String>("rua"));
        telefone.setCellValueFactory(new PropertyValueFactory<Clientes,String>("numtelemovel"));
        listaCl.readAll(String.valueOf(CltableView));

       // CltableView.setRowFactory(tv -> {
        //  TableRow<Clientes> row = new TableRow<>() ;
          //       Clientes rowData = row.getItem();



        //    return row;
      //  });

    //  CltableView.getItems().addAll(listaCl);

       */
        List<Clientes> listaCl = ClienteBLL.readAll();
        ObservableList<Clientes> row =  FXCollections.observableArrayList(listaCl);;
        //CltableView.setItems(row);
       // ClienteBLL   listCliente = new ClienteBLL();
      //  row = listCliente.getSelectionModel().getSelectedItems();

        //ClienteBLL listaCl =  new ClienteBLL();
     //   codigopostal.setCellValueFactory(new PropertyValueFactory<Clientes,Integer>("codpostal"));
        morada.setCellValueFactory(new PropertyValueFactory<Clientes,String>("rua"));
        nome.setCellValueFactory(new PropertyValueFactory<Clientes,String>("nome"));
        telefone.setCellValueFactory(new PropertyValueFactory<Clientes,String>("numtelemovel"));
        //nome.setCellValueFactory(cellData -> cellData.getValue().getNome());
            //String nome = rowData.toString();
        String nome = row.get(0).getNome();

        //listaCl.addAll(listaCl);

        System.out.println(row);



         }

    }

