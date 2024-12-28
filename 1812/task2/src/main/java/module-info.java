module ru.samsonova.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samsonova.task2 to javafx.fxml;
    exports ru.samsonova.task2;
}