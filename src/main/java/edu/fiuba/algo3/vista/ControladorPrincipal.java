package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class ControladorPrincipal implements Initializable {

	@FXML
	private Pane panelInferior;
	@FXML
	private Pane panelSuperiorDerecho;
	@FXML
	private Pane panelSuperiorIzquierdo;

	private Pane panelDibujo;
	private Pane panelBloques;
	private Pane panelAlgoritmo;

	public ControladorPrincipal(Pane panelBloques, Pane panelAlgoritmo, Pane panelDibujo) {
		this.panelBloques = panelBloques;
		this.panelAlgoritmo = panelAlgoritmo;
		this.panelDibujo = panelDibujo;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void levantarComponentes() {
		panelInferior.getChildren().add(panelDibujo);
		panelSuperiorDerecho.getChildren().add(panelAlgoritmo);
		panelSuperiorIzquierdo.getChildren().add(panelBloques);
	}

}
