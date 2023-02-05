module com.example.labterminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labterminal to javafx.fxml;
    exports com.example.labterminal;
}