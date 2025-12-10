package com.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label messageLabel;

    @FXML
    protected void onButtonClick() {
        messageLabel.setText("Hello from Controller!");
        System.out.println("Button clicked from FXML");
    }
}

