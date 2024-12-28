module ru.samsonova.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samsonova.task4 to javafx.fxml;
    exports ru.samsonova.task4;
}