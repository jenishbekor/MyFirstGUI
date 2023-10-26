module com.example.myfirstgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstgui to javafx.fxml;
    exports com.example.myfirstgui;
}