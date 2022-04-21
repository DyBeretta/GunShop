package com.example.gunshoprentingsystem;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Group root = new Group();
            Scene scene = new Scene(root, Color.BLACK);

            Image icon = new Image("file:BIcon.png");
            stage.getIcons().add(icon);

            stage.setTitle("Gun Shop Renting Program");

            stage.setScene(scene);
            stage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}