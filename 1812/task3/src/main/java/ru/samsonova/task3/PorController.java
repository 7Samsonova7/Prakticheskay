package ru.samsonova.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PorController {

    @FXML
    private Label BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private TextField aTextField;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aTextField.getText().toString());
        int b = Integer.parseInt(BTextField.getText().toString());
        int c = Integer.parseInt(CTextField.getText().toString());
        if (a == b) {
            reslabel.setText("Порядковый номер 3");
        }else if (a == c) {
            reslabel.setText("Порядковый номер 2");}
        else{
            reslabel.setText("Порядковый номер 1");
        }
    }

}
