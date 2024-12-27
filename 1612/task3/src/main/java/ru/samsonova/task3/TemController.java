package ru.samsonova.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemController {

    @FXML
    private TextField ATextField;

    @FXML
    private Button GobuttononAction;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        float a =Float.parseFloat(ATextField.getText().toString());
        reslabel.setText("T="+(a-32)*5/9);

    }

}
