package ru.samsonova.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PerController {

    @FXML
    private TextField ATextField;

    @FXML
    private Button GobuttononAction;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int a=Integer.parseInt(ATextField.getText().toString());
        reslabel.setText("S="+a/100);
    }

}
