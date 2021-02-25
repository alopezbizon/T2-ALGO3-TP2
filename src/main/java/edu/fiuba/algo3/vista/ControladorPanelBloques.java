package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControladorPanelBloques implements Initializable{
	
	@FXML
	private Button buttonMovArriba;
	@FXML
	private Button buttonMovAbajo;
	@FXML
	private Button buttonMovDerecha;
	@FXML
	private Button buttonMovIzquierda;
	@FXML
	private Button buttonLapizArriba;
	@FXML
	private Button buttonLapizAbajo;
	@FXML
	private Button buttonRepetirDosVeces;
	@FXML
	private Button buttonRepetirTresVeces;
	@FXML
	private Button buttonInvertir;
	@FXML
	private Button buttonAlgoritmoGuardado;
	
	private ModuloAlgoritmo moduloAlgoritmo;

	public ControladorPanelBloques(ModuloAlgoritmo moduloAlgoritmo) {
		this.moduloAlgoritmo = moduloAlgoritmo;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
		
		buttonMovArriba.setOnAction(event -> moduloAlgoritmo.agregarBloqueMovimientoArriba());
		
		buttonMovAbajo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueMovimientoAbajo();	
			}
		});
		
		buttonMovDerecha.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueMovimientoDerecha();	
			}
		});
		buttonMovIzquierda.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueMovimientoIzquierda();	
			}
		});
		buttonLapizArriba.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueLapizArriba();	
			}
		});
		buttonLapizAbajo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueLapizAbajo();	
			}
		});
		buttonRepetirDosVeces.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueRepetirDosVeces();	
			}
		});
		buttonRepetirTresVeces.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueRepetirTresVeces();	
			}
		});
		buttonInvertir.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueInvertir();	
			}
		});
		buttonAlgoritmoGuardado.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				moduloAlgoritmo.agregarBloqueAlgoritmoGuardado();	
			}
		});		
	}
}
