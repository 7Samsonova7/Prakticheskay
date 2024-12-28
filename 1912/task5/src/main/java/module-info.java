module ru.samsonova.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.samsonova.task5 to javafx.fxml;
    exports ru.samsonova.task5;
}