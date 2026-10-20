
package com.mycompany.tabla_multiplicar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class TablaController implements Initializable {

    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnLimpiar;
    @FXML
    private TextField txtNumero;
    @FXML
    private TextArea textTabla;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calcularNumero(ActionEvent event) {
        try {
            String texto = txtNumero.getText().trim();
            if (texto.isEmpty()) {
                return;
            }

            int numero = Integer.parseInt(texto);
            StringBuilder resultado = new StringBuilder();

            for (int i = 1; i <= 10; i++) {
                int mult = numero * i;
                resultado.append(numero).append(" x ").append(i).append(" = ").append(mult).append("\n");
            }

            textTabla.setText(resultado.toString());

        } catch (NumberFormatException e) {
            textTabla.setText("Ingrese un número válido.");
        }
    }

    @FXML
    private void limpiarCampos(ActionEvent event) {
        txtNumero.setText("");
        textTabla.setText("");
        txtNumero.requestFocus();
    }

    
}
