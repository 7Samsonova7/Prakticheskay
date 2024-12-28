package ru.samsonova.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DayController {

    @FXML
    private TextField DDTextField;

    @FXML
    private TextField MMTextField;

    @FXML
    private Button goButton;

    @FXML
    private Label resLabel;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        int DD = Integer.parseInt(DDTextField.getText().toString());
        int MM = Integer.parseInt(DDTextField.getText().toString());
        if (DD + 1 > 31) {
            DD = 1;
        } else {
            DD = DD + 1;

        }
        if (MM + 1 > 12) {
            MM = 1;
        } else {
            MM = MM +1;

        }
        resLabel.setText("DD="+DD+"MM="+MM);
    }

    }


