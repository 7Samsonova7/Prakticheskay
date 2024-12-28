package ru.samsonova.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NController {

    @FXML
    private TextField nTextField;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText().toString());
        double S =0.0;
        for (int i = 1; i <= N; i++) {
            S += 1.0 / i;
        }
        reslabel.setText("N=" + N);
    }

}
