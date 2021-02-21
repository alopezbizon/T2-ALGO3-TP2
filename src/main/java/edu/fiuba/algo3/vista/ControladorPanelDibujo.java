package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class ControladorPanelDibujo implements Initializable {

    @FXML
    private Canvas canvasSectorDibujo;
    private GraphicsContext contextoGraficoDibujo;
    private ModuloAlgoritmo moduloAlgoritmo;

    public ControladorPanelDibujo(ModuloAlgoritmo moduloAlgoritmo) {
        this.moduloAlgoritmo = moduloAlgoritmo;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.contextoGraficoDibujo = this.canvasSectorDibujo.getGraphicsContext2D();
    }
}