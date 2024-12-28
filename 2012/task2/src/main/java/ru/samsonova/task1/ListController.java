package ru.samsonova.task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class ListController {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button okButton;

    @FXML
    void CancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int n = data.get(0);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int m = data.get(i);
            if (m % 10 == 3 && m > max) {
                max = m;
            }
        }
        if (max != 0)
            answerLabel.setText(String.valueOf(max));
        answerLabel.setText(String.valueOf(max));}
    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            // создание диалогового окна
            Alert Alert = new Alert(javafx.scene.control.Alert.AlertType.ERROR);
            //установка текста диалогового окна
            Alert.setContentText("Введены некорректные данные");
            // показ диалогового окна
            Alert.showAndWait();
        } finally {
            // отчистка текстового поля от предыдущего введеного значения
            numberTextField.setText("");
        }
    }

}
