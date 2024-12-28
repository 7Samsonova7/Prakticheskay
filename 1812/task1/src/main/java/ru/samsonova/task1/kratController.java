package ru.samsonova.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class kratController {

    @FXML
    private Button GobuttononAction;

    @FXML
    private TextField aTextField;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int a =Integer.parseInt(aTextField.getText());
        if ((a/10+a%10)%2!=0) {
            reslabel.setText("Сумма цифр кратна=:" + a);
        } else
            reslabel.setText("Сумма цифр не кратна="+a);
    }

}
