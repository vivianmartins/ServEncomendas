package com.example.fx.controllerAdmin;

import com.bd.DAL.Pratos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ementaRegistoAdmin {

    @FXML
    private Button btnRegistar;

    @FXML
    private Button btnVoltarEs;

    @FXML
    private TextField preco;

    @FXML
    private TextField prato;

    @FXML
    private TextField stock;

    @FXML
    void edPrato(ActionEvent event) {

    }

    @FXML
    void edPreco(ActionEvent event) {

    }

    @FXML
    void edStock(ActionEvent event) {

    }

    @FXML
    void handleBtnRegistar(ActionEvent event) {
        if (isInputValid()) {
            {
                Pratos pratos = new Pratos();
                pratos.setStockdoses(Integer.parseInt(stock.getText()));
                pratos.setPrecoatual(Integer.parseInt(preco.getText()));
                pratos.setDescricao(prato.getText());

            }
        }
        }

    @FXML
    void handleBtnVoltarEs(ActionEvent event) {

    }
    public boolean isInputValid(){


        String errorMessage = "";

        if (preco.getText().isEmpty() || preco.getText().length() == 0) {
            errorMessage += "Preco inválido!\n";
        }

        if (prato.getText() == null || prato.getText().length() == 0) {
            errorMessage += "Prato inválido!\n";
        }
        if (stock.getText() == null || stock.getText().length() == 0) {
            errorMessage += "Username inválido!\n";
        }


        if (errorMessage.length() == 0 ) {
            return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Campos inválidos");
            alert.setHeaderText("Preencha corretamente os campos!");
            alert.setContentText(errorMessage);
            alert.showAndWait();
            return false;
        }

    }
}
