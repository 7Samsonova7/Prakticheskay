package ru.samsonova.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PeresController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button goButton;

    @FXML
    private Label resLabel;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        float b = Float.parseFloat(bTextField.getText().toString());
        float m;
        if (a > b) {
            m = a;
            a = b;
            b = m;

        } resLabel.setText(String.valueOf(a));
        resLabel.setText(String.valueOf(b));
    }

}
