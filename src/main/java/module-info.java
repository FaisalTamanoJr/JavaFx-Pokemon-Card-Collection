module com.example.javafxpokemoncardcollection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxpokemoncardcollection to javafx.fxml;
    exports com.example.javafxpokemoncardcollection;
}