package com.example.fx.controllerAdmin;

import com.bd.BLL.ClienteBLL;
import com.bd.BLL.EstafetaBLL;
import com.bd.BLL.UsersBLL;
import com.bd.DAL.Clientes;
import com.bd.DAL.Estafeta;

import com.bd.DAL.Users;
import com.example.fx.loginController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class adminEstafetasController implements Initializable {
    private List<Estafeta> listEsta = EstafetaBLL.readAll();
    ObservableList<Estafeta> listaEst = FXCollections.observableArrayList(EstafetaBLL.readAllEst(true));

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnNew;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnRemover;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private Button btnEstafetaEli;

    @FXML
    private TableColumn<Estafeta, String> email;

    @FXML
    private TableColumn<Estafeta, Number> nif;

    @FXML
    private TableColumn<Estafeta, String> nome;

    @FXML
    private TableColumn<Estafeta, String> password;

    @FXML
    private TableColumn<Estafeta, String> telefone;

    @FXML
    private TableView<Estafeta> tblEstafeta;



    @FXML
    void handleBtnEditar(ActionEvent event) {


    }

    @FXML
    void handleBtnLogout(ActionEvent event) {

    }

    @FXML
    void handleBtnNew(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/estafetaregistoAdmin.fxml"));
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
    void handleBtnRemover(ActionEvent event) {

            Estafeta est =  tblEstafeta.getSelectionModel().getSelectedItem();
            tblEstafeta.getItems();
            int id = est.getIdEstafeta();
            est.setEstado(false);
            EstafetaBLL.update(est);

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Estafeta");
            alert.setHeaderText("Estafeta removido com sucesso");
            alert.setContentText("Atualize a página");
            alert.show();
    }


    @FXML
    void handleBtnUpdate(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/estafetasAdmin.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();
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


    @FXML
    void    handleBtnEstafeEli(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/estafetaeliminados.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960 , 600);
        stage.setScene(scene);
        stage.show();

        Node source = (Node)  event.getSource();
        Stage stageAtual  = (Stage) source.getScene().getWindow();
        stageAtual.close();

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        //ObservableList<Estafetas> listaEst = FXCollections.observableArrayList(EstafetaBLL.readAll());

        nome.setCellValueFactory(new PropertyValueFactory<Estafeta, String>("nome"));
        email.setCellValueFactory(new PropertyValueFactory<Estafeta, String>("email"));
        password.setCellValueFactory(new PropertyValueFactory<Estafeta, String>("password"));
        nif.setCellValueFactory(new PropertyValueFactory<Estafeta, Number>("nif"));
        telefone.setCellValueFactory(new PropertyValueFactory<Estafeta, String>("numtelefone"));
        tblEstafeta.setItems(listaEst);

        // EstafetaBLL est = new EstafetaBLL();
        //UsersBLL users = new UsersBLL();
/*
         for ( var es : EstafetaBLL.readAll()){
                for ( var users : UsersBLL.readAll() ){
                    if(es.g == users.getIdUser())
                        es.
                }


         }
         }
 */
    }
}
