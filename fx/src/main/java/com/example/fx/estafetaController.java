package com.example.fx;

import com.example.bd.BLL.PratoBLL;
import com.example.bd.DAL.Pratos;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

import java.util.List;


public class estafetaController {

    @FXML
    private TableColumn<email, string> lblEmail;

    @FXML
    private TableColumn<nif,integer> lblNif;

    @FXML
    private TableColumn<nome, string> lblNome;

    @FXML
    private TableColumn<password,string> lblPassword;

    @FXML
    private TableColumn<telefone, integer> lblTelefone;

    public void initialize() {


    }
}
