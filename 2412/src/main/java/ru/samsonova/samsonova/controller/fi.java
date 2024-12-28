package ru.samsonova.samsonova.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.samsonova.samsonova.util.Manager.showSecondScene;

public class fi {

    @FXML
    private Button BackB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("hello-view.fxml","Marathon Skills 2016");

    }

}
