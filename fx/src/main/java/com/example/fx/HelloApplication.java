package com.example.fx;

import com.example.bd.BLL.ClienteBLL;
import com.example.bd.BLL.PratoBLL;
import com.example.bd.DAL.Pratos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

import com.example.bd.DAL.Clientes;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        List<Pratos> listaPra = PratoBLL.readAll("Francesinha");
        for(Pratos pra : listaPra)
            System.out.println( " nome:  " + pra.getDescricao()  + " preço: "+ pra.getPrecoatual());




        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}