package ru.samsonova.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class AController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField NTextField;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        float A = Float.parseFloat(ATextField.getText().toString());
        int N=Integer.parseInt(NTextField.getText().toString());
        double S = 0;
        for(int i=0;i<=N;i++){
            S+=pow(-1,i)*pow(A,i);
        }
        reslabel.setText("S="+S);
    }
    }


