module hmlab {
    requires javafx.controls;
    requires javafx.fxml;

    opens hmlab to javafx.fxml;
    exports hmlab;
}
