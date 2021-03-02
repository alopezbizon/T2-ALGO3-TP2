package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import edu.fiuba.algo3.modelo.bloques.Bloque;
import edu.fiuba.algo3.modelo.eventos.EventosBloque;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ControladorPanelAlgoritmo implements Initializable {

	@FXML
	private Button buttonEjecutar;
	@FXML
	private Button buttonReiniciar;
	@FXML
	private Button buttonGuardar;
	@FXML
	private ListView listAlgoritmo;	
	
	private ModuloAlgoritmo moduloAlgoritmo;
	
	public ControladorPanelAlgoritmo(ModuloAlgoritmo moduloAlgoritmo) {
		this.moduloAlgoritmo = moduloAlgoritmo;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.inicializarEventos();

		buttonEjecutar.setOnAction(event -> moduloAlgoritmo.ejecutarAlgoritmo());
		buttonReiniciar.setOnAction(event -> {
			moduloAlgoritmo.reiniciarAlgoritmo();
			listAlgoritmo.getItems().clear();
		});
		buttonGuardar.setOnAction(event -> moduloAlgoritmo.guardarAlgoritmo());
		
		listAlgoritmo.setCellFactory(bloqueAgregado -> new BloqueCell());
	}

	private void inicializarEventos() {
		EventosBloque eventos = moduloAlgoritmo.getEventos();
		eventos.getOnAgregarBloque().getCallbacks().add(B -> Platform.runLater(() -> onAgregarBloque(B)));
	}

	private void onAgregarBloque(Bloque bloque) {
		listAlgoritmo.getItems().add(bloque);	
	}

}
