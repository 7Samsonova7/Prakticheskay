module ru.samsonova.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samsonova.task1 to javafx.fxml;
    exports ru.samsonova.task1;
}