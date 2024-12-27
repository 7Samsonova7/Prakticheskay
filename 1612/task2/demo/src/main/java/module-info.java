module ru.samsonova.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samsonova.demo to javafx.fxml;
    exports ru.samsonova.demo;
}