package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tramo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class ControladorPanelDibujo implements Initializable {

    public static final int LARGO_LINEA = 40;

    @FXML
    private Canvas canvasSectorDibujo;
    private GraphicsContext contextoGraficoDibujo;
    private List posiciones;
    private ModuloAlgoritmo moduloAlgoritmo;

    public ControladorPanelDibujo(ModuloAlgoritmo moduloAlgoritmo) {
        this.moduloAlgoritmo = moduloAlgoritmo;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.contextoGraficoDibujo = this.canvasSectorDibujo.getGraphicsContext2D();
        this.inicializarPosiciones();
    }

    private void inicializarPosiciones() {
        this.posiciones = new ArrayList<Posicion>();

        int ancho = (int) this.canvasSectorDibujo.getWidth() / LARGO_LINEA;
        int alto = (int) this.canvasSectorDibujo.getHeight() / LARGO_LINEA;

        for (int x = 0; x < ancho; x++) {
            for (int y = 0; y < alto; y++) {
                this.posiciones.add(new Posicion(x, y));
            }
        }
    }

    public void pintarTramo(Tramo tramo) {
        Posicion inicio = tramo.obtenerInicio();
        Posicion fin = tramo.obtenerFin();

        contextoGraficoDibujo.strokeLine(
                inicio.obtenerX() * LARGO_LINEA,
                inicio.obtenerY() * LARGO_LINEA,
                fin.obtenerX() * LARGO_LINEA,
                fin.obtenerY() * LARGO_LINEA
        );
    }
}