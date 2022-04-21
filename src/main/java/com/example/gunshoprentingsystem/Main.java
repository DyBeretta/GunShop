package com.example.gunshoprentingsystem;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Group root = new Group();
            Scene scene = new Scene(root);

            Text text = new Text();
            text.setText("AAAAAAAAAAAAA");
            text.setX(50);
            text.setY(50);
            text.setFont(Font.font("Verdana",50));
            text.setFill(Color.GREENYELLOW);

            Image icon = new Image(getClass().getResourceAsStream("/images/B32Icon.png"));
            stage.getIcons().add(icon);
            stage.setTitle("Gun Shop Renting Program");
            stage.setWidth(1000);
            stage.setHeight(1000);
            stage.setResizable(false);
            stage.setFullScreen(true);

            root.getChildren().add(text);
            stage.setScene(scene);
            stage.show();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}