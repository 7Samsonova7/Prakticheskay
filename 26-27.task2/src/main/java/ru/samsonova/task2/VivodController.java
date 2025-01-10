package ru.samsonova.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VivodController {

    @FXML
    private Label aL;

    @FXML
    private TextField aTextField;

    @FXML
    private Label bL;

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
        aL.setText("a="+a);
        bL.setText("b="+b);

    }

}
