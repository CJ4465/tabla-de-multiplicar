module com.mycompany.tabla_multiplicar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tabla_multiplicar to javafx.fxml;
    exports com.mycompany.tabla_multiplicar;
}
