package ru.samsonova.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button goButton;

    @FXML
    private Label resLabel;

    @FXML
    private Label resLabel2;

    @FXML
    private Label resLabel3;

    @FXML
    private Label resLabel4;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        float a= Float.parseFloat(aTextField.getText().toString());
        float b= Float.parseFloat(bTextField.getText().toString());
        resLabel.setText("S="+(a+b));
        resLabel2.setText("D="+(a-b));
        resLabel3.setText("P="+(a*b));
        resLabel4.setText("G="+(a/b));
    }

}
