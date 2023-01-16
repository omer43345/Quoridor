package com.example.quoridor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // use FXMLLoader to load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main-page.fxml"));
        // load the root node from the FXML file
        Pane root = loader.load();
        // create a scene with the root node
        Scene scene = new Scene(root);
        // set the scene to the stage
        stage.setScene(scene);
        // set the title of the stage
        stage.setTitle("Quoridor");

        // show the stage
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}