module ru.samsonova.samsonova {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samsonova.samsonova to javafx.fxml;
    exports ru.samsonova.samsonova;
    exports ru.samsonova.samsonova.controller;
    opens ru.samsonova.samsonova.controller to javafx.fxml;
}