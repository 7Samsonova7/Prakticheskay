package ru.samsonova.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PPPController {

    @FXML
    private TextField NTextField;

    @FXML
    private Button goButton;

    @FXML
    private Label resLabel;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        int N=Integer.parseInt(NTextField.getText().toString());
        int k =0;
        int S=0;
        while (S<N){
            k++;
            S=S+k;
        }
        resLabel.setText("Наибольшее k="+k+"Сумма"+S);

    }

}
