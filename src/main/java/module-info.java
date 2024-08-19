module com.example.prilozhukha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prilozhukha to javafx.fxml;
    exports com.example.prilozhukha;
}