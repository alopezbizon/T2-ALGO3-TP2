package edu.fiuba.algo3.app;

import java.io.IOException;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import edu.fiuba.algo3.vista.ControladorPanelAlgoritmo;
import edu.fiuba.algo3.vista.ControladorPanelBloques;
import edu.fiuba.algo3.vista.ControladorPanelDibujo;
import edu.fiuba.algo3.vista.ControladorPrincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	private ModuloAlgoritmo moduloAlgoritmo;

	private Stage stage;

	private Pane panelAlgoritmo;
	private Pane panelDibujo;
	private Pane panelBloques;
	
	private ControladorPrincipal mainController;

	@Override
	public void start(Stage primaryStage) {
		this.stage = primaryStage;
		this.inicializarModelo();
		this.inicializarAplicacion();
		this.levantarApp();
	}

	private void inicializarModelo() {
		moduloAlgoritmo = new ModuloAlgoritmo();
	}

	private void levantarApp() {
		mainController.levantarComponentes();		
	}

	private void inicializarAplicacion() {
		this.inicializarPaneles();
		this.inicializarVentenaPrincipal();
	}

	private void inicializarPaneles() {
		this.inicializarPanelDibujo();
		this.inicializarPanelBloques();
		this.inicializarPanelAlgoritmo();		
	}

	private void inicializarPanelAlgoritmo() {		
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("panel-algoritmo.fxml"));
			loader.setController(new ControladorPanelAlgoritmo(moduloAlgoritmo));
			panelAlgoritmo = loader.load();
		} catch (IOException e) {
			System.out.println("error al levantar panel-algoritmo.fxml");
		}
	}

	private void inicializarPanelBloques() {				
		try {
			
			FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("panel-bloques.fxml"));
			loader.setController(new ControladorPanelBloques(moduloAlgoritmo));
			panelBloques = loader.load();
		} catch (IOException e) {
			System.out.println("error al levantar panel-bloques.fxml");
		}
		
	}

	private void inicializarPanelDibujo() {	
		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("panel-dibujo.fxml"));
			loader.setController(new ControladorPanelDibujo(moduloAlgoritmo));
			panelDibujo = loader.load();
		} catch (IOException e) {
			System.out.println("error al levantar panel-dibujo.fxml");
		}
	}

	private void inicializarVentenaPrincipal() {		
		try {
			mainController = new ControladorPrincipal(panelBloques,panelAlgoritmo, panelDibujo);
			FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("ventana-principal.fxml"));
			loader.setController(mainController);
			Parent root = loader.load();
			
			stage.setTitle("AlgoBlocks");
			stage.setScene(new Scene(root));
			stage.setWidth(1200);
			stage.setHeight(900);
			stage.show();
			
		} catch (IOException e) {
			System.out.println("error al levantar ventana-principal.fxml");
		}
	}

	public static void main(String[] args) {
		launch();
	}
}