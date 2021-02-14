package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.BloqueComplejo;
import edu.fiuba.algo3.modelo.BloqueMovAbajo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ControladorPrincipal implements Initializable{
	
	
	@FXML
	private Button botonMovimientoIzquierda;
	@FXML
	private Button botonMovimientoDerecha;
	@FXML
	private Button botonMovimientoArriba;
	@FXML
	private Button botonMovimientoAbajo;
	@FXML
	private VBox vBoxAlgoritmo;
	
	
	private BloqueComplejo modulo;
	
	public ControladorPrincipal(BloqueComplejo modulo) {
		this.modulo = modulo;
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		botonMovimientoAbajo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				modulo.agregarBloque(new BloqueMovAbajo());
				vBoxAlgoritmo.getChildren().add(new Label("Bloque Movimiento Arriba"));
				
			}
		});
		
		
		
	}
		
	

}
