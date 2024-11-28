module com.example.rng {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rng to javafx.fxml;
    exports com.example.rng;
}