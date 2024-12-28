module ru.samsonova.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samsonova.task3 to javafx.fxml;
    exports ru.samsonova.task3;
}