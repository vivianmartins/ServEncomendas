package com.example.fx.controllerAdmin;

import com.example.bd.BLL.ClienteBLL;
import com.example.bd.BLL.UsersBLL;
import com.example.bd.DAL.Clientes;
import com.example.bd.DAL.Users;
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

public class adminGestorController implements Initializable {

   // ObservableList<Users> list =    FXCollections.observableArrayList();

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnNew;

    @FXML
    private Button btnPesquisar;

    @FXML
    private Button btnRemover;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TableColumn<Users, String> email;

    @FXML
    private TableColumn<Users, String> username;

    @FXML
    private TableColumn<Users, String> password;

    @FXML
    void handleBtnEditar(ActionEvent event) {

    }

    @FXML
    void handleBtnLogout(ActionEvent event) {

    }

    @FXML
    void handleBtnNew(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(loginController.class.getResource("Admin/gestorRegistoAdmin.fxml"));
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

    @FXML
    void handleBtnRemover(ActionEvent event) {

    }


    @FXML
    private TableView<Users> tblGestor;


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



    public void initialize(URL url, ResourceBundle rb) {


        ObservableList<Users> listaUser = FXCollections.observableArrayList(UsersBLL.readAll(true));

        //UsersBLL users = new UsersBLL();
        username.setCellValueFactory(new PropertyValueFactory<Users,String>("nomeuser"));
        email.setCellValueFactory(new PropertyValueFactory<Users,String>("email"));
        password.setCellValueFactory(new PropertyValueFactory<Users,String>("password"));
        tblGestor.setItems(listaUser);
    }
}
