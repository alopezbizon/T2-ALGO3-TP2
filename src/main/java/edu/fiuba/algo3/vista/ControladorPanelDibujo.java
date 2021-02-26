package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tramo;
import edu.fiuba.algo3.modelo.eventos.EventosBloque;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class ControladorPanelDibujo implements Initializable {

    private double ANCHO_CANVAS;
    private double ALTO_CANVAS;
    private static final int LARGO_LINEA = 40;
    private static final int AJUSTE_SIGNO = -1;

    @FXML
    private Canvas canvasSectorDibujo;
    
    private GraphicsContext contextoGraficoDibujo;
    
    private ModuloAlgoritmo moduloAlgoritmo;

    public ControladorPanelDibujo(ModuloAlgoritmo moduloAlgoritmo) {
        this.moduloAlgoritmo = moduloAlgoritmo;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	this.inicializarEventos();
    	
        this.contextoGraficoDibujo = this.canvasSectorDibujo.getGraphicsContext2D();
        this.ANCHO_CANVAS = this.canvasSectorDibujo.getWidth();
        this.ALTO_CANVAS = this.canvasSectorDibujo.getHeight();
    }

    private void inicializarEventos() {
    	EventosBloque eventos = moduloAlgoritmo.getEventos();
		eventos.getOnDibujar().getCallbacks().add(Tramos -> Platform.runLater(() -> onDibujar(Tramos)));
		eventos.getOnReiniciar().getCallbacks().add(S -> Platform.runLater(() -> onReiniciar(S)));
		
	}
    
    private void onReiniciar(String s) {
		borrarDibujo();
	}

	private void  onDibujar(List<Tramo> tramos) {
    	for(Tramo tramo: tramos) {
    		pintarTramo(tramo);
    	}    	
    }

    public void pintarTramo(Tramo tramo) {
        Posicion inicio = tramo.obtenerInicio();
        Posicion fin = tramo.obtenerFin();
        
        double offset_x = ANCHO_CANVAS/2;
        double offset_y = ALTO_CANVAS/2;

        // Al Se ajusta el signo de 'y' para que no dibuje en espejo.
        contextoGraficoDibujo.strokeLine(
        		offset_x + inicio.obtenerX() * LARGO_LINEA,
        		offset_y + inicio.obtenerY() * LARGO_LINEA * AJUSTE_SIGNO,
                offset_x + fin.obtenerX() * LARGO_LINEA,
                offset_y + fin.obtenerY() * LARGO_LINEA * AJUSTE_SIGNO
        );
    }

    public void borrarDibujo() {
        contextoGraficoDibujo.clearRect(0,0, this.ANCHO_CANVAS, this.ALTO_CANVAS);
    }
}