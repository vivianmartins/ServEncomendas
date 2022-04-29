package com.example.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class login extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       /* List<Pratos> listaPra = PratoBLL.readAll("Francesinha");
        for(Pratos pra : listaPra)
            System.out.println( " nome:  " + pra.getDescricao()  + " preço: "+ pra.getPrecoatual());
*/



        FXMLLoader fxmlLoader = new FXMLLoader(login.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}