package ru.demo.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TestController {

    @FXML
    private Label NTextField;

    @FXML
    private TextField kTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {

        int n = Integer.parseInt(nTextField.getText().toString());
              int k=1;
       while (3*k<=n) {
            k = k + 1;
        }
        reslabel.setText("k="+k);
    }

}
