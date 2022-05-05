package com.example.fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {



    @Override
    public void start(Stage stage)  throws  IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(logincontroller.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load( ), 960 , 600);
        stage.setTitle("LOGIN");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);


    }
}
//fx:controller="com.example.fx.controller.estafetaController"