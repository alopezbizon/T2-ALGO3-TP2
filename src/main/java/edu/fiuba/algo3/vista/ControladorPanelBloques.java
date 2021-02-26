package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
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
		buttonMovAbajo.setOnAction(event -> moduloAlgoritmo.agregarBloqueMovimientoAbajo());		
		buttonMovDerecha.setOnAction(event -> moduloAlgoritmo.agregarBloqueMovimientoDerecha());
		buttonMovIzquierda.setOnAction(event -> moduloAlgoritmo.agregarBloqueMovimientoIzquierda());
		buttonLapizArriba.setOnAction(event -> moduloAlgoritmo.agregarBloqueLapizArriba());
		buttonLapizAbajo.setOnAction(event -> moduloAlgoritmo.agregarBloqueLapizAbajo());
		buttonRepetirDosVeces.setOnAction(event -> moduloAlgoritmo.agregarBloqueRepetirDosVeces());
		buttonRepetirTresVeces.setOnAction(event -> moduloAlgoritmo.agregarBloqueRepetirTresVeces());
		buttonInvertir.setOnAction(event -> moduloAlgoritmo.agregarBloqueInvertir());
		buttonAlgoritmoGuardado.setOnAction(event -> moduloAlgoritmo.agregarBloqueAlgoritmoGuardado());		
	}
}
