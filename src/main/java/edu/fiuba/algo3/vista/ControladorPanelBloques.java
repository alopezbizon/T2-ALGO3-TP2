package edu.fiuba.algo3.vista;

import java.net.URL;
import java.util.ResourceBundle;

import edu.fiuba.algo3.modelo.ModuloAlgoritmo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControladorPanelBloques implements Initializable{
	
	private static final int ANCHO_IMAGEN = 30;
	
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
	@FXML
	private Button buttonNoAgregarMas;
	
	private ModuloAlgoritmo moduloAlgoritmo;

	public ControladorPanelBloques(ModuloAlgoritmo moduloAlgoritmo) {
		this.moduloAlgoritmo = moduloAlgoritmo;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {				
		inicializarEventosBotones();
		inicializarImagenesBotones();			
	}

	private void inicializarImagenesBotones() {
		buttonLapizAbajo.setGraphic(generarImagen("bloque_bajar_lapiz"));
		buttonLapizArriba.setGraphic(generarImagen("bloque_subir_lapiz"));
		buttonMovAbajo.setGraphic(generarImagen("bloque_mov_abajo"));
		buttonMovArriba.setGraphic(generarImagen("bloque_mov_arriba"));
		buttonMovDerecha.setGraphic(generarImagen("bloque_mov_derecha"));
		buttonMovIzquierda.setGraphic(generarImagen("bloque_mov_izquierda"));
		buttonAlgoritmoGuardado.setGraphic(generarImagen("bloque_algoritmo"));
		buttonRepetirDosVeces.setGraphic(generarImagen("bloque_repetir_dos_veces"));
		buttonRepetirTresVeces.setGraphic(generarImagen("bloque_repetir_tres_veces"));
		buttonInvertir.setGraphic(generarImagen("bloque_inversor"));			
	}

	private ImageView generarImagen(String nombreImagen) {
		ImageView imagen = new ImageView();
		Image image = new Image(getClass().getClassLoader().getResourceAsStream("images/"+nombreImagen+".png"));
		imagen.setImage(image);
		imagen.setFitWidth(ANCHO_IMAGEN);
		imagen.setPreserveRatio(true);
		return imagen;
		
	}

	private void inicializarEventosBotones() {
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
		buttonNoAgregarMas.setOnAction(event -> moduloAlgoritmo.noAgregaMas());
		
	}
}
