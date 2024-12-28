package ru.samsonova.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NedController {

    @FXML
    private Button GobuttononAction;

    @FXML
    private TextField kTextField;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
int k =Integer.parseInt(kTextField.getText().toString());
int n=(k+4) % 7+1;
        reslabel.setText("День недели:" + n);
    }

}
