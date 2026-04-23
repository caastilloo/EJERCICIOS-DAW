package org.example.mantenimientodeestudiantes;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;

public class HelloController {
    public VBox vBox;
    public Label textoInicial;
    public TableColumn tablaBaseDatos;
    public HBox cajaBotones1;
    public Button botonEditar;
    public Button botonEliminar;
    public TextField textFieldNia;
    public TextField textFieldNombre;
    public DatePicker datePickerFecha;
    public HBox cajaBotones2;
    public Button botonInsertar;
    public Button botonGuardar;
    public TableView<Estudiante> tableViewTabla;
    public TableColumn<Estudiante, Integer> columnaNia;
    public TableColumn<Estudiante, String> columnaNombre;
    public TableColumn<Estudiante, LocalDate> columnaFecha;

    @FXML
    private Label welcomeText;

    @FXML
    public void initialize(){
        columnaNia.setCellValueFactory(datos -> new SimpleIntegerProperty(datos.getValue().getNia()).asObject());
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onEditarButtonClick(){

    }

    @FXML
    protected void onEliminarButtonClick(){

    }

    @FXML
    protected void onInsertarButtonClick(){

    }

    @FXML
    protected void onGuardarButtonClick(){

    }
}
