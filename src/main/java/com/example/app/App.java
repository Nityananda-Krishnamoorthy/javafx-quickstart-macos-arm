package com.example.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Button btn = new Button("Hello JavaFX!");
        btn.setOnAction(e -> System.out.println("Button clicked"));

        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX App - Starter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

