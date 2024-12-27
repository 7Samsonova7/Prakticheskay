package ru.samsonova.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VivodController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
 float a=Float.parseFloat(aTextField.getText().toString());
 float b=Float.parseFloat(bTextField.getText().toString());
 float c=a;
 a=b;
 b=c;
 aTextField.setText(String.valueOf(a));
 bTextField.setText(String.valueOf(b));
    }

}
