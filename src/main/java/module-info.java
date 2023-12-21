module com.example.buttoncuztomizations {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buttoncuztomizations to javafx.fxml;
    exports com.example.buttoncuztomizations;

    // You need to import all the libraries here in module
    requires java.desktop;
}