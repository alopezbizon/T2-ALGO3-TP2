package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import edu.fiuba.algo3.modelo.bloques.Bloque;
import edu.fiuba.algo3.modelo.eventos.EventosBloque;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ControladorPanelAlgoritmo implements Initializable {
	
	@FXML
	private ListView listAlgoritmo;	
	
	private ModuloAlgoritmo moduloAlgoritmo;
	
	public ControladorPanelAlgoritmo(ModuloAlgoritmo moduloAlgoritmo) {
		this.moduloAlgoritmo = moduloAlgoritmo;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.inicializarEventos();
		
	}

	private void inicializarEventos() {
		EventosBloque eventos = moduloAlgoritmo.getEventos();
		eventos.getOnAgregarBloque().getCallbacks().add(B -> Platform.runLater(() -> onAgregarBloque(B)));
	}

	private void onAgregarBloque(Bloque bloque) {
		System.out.println(bloque.toString());
		System.out.println("agregando bloque");
		listAlgoritmo.getItems().clear();
		listAlgoritmo.getItems().addAll(moduloAlgoritmo.getBloques());
	}
	
	
//	Button boton = new Button("MovAbajo");
//	
//	boton.setOnAction(new EventHandler<ActionEvent>() {
//		public ControladorPanelAlgoritmo(ModuloAlgoritmo moduloAlgoritmo) {
//		// TODO Auto-generated constructor stub
//	}
//
//		
//
//		@Override
//		public void handle(ActionEvent event) {
//			vBoxAlgoritmo.getChildren().remove(boton);
//			modulo.eliminarUltimoBloque();
//			System.out.println(modulo.tamanio());
//		}
//
//	});
//	
//	vBoxAlgoritmo.getChildren().add(boton);
//	System.out.println(modulo.tamanio());

}
