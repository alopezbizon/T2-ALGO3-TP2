package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.bloques.Bloque;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BloqueCell extends ListCell<Bloque> {

	static final int ANCHO_IMAGEN = 25;
	
	private Node view;
	
	private ImageView imagen = new ImageView();
	
	public BloqueCell(ControladorPanelAlgoritmo controladorPanelAlgoritmo) {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void updateItem(Bloque item, boolean empty) {
		super.updateItem(item, empty);

		if (empty) {
			setGraphic(null);
			view = null;
		} else {
			Image image;
			image = new Image(getClass().getClassLoader().getResourceAsStream("\\images\\"+item.getNombreBloque()+".png"));
			imagen.setImage(image);
			imagen.setFitWidth(ANCHO_IMAGEN);
			imagen.setPreserveRatio(true);
			setGraphic(imagen);
		}
	}

//	private void generarvista(String item) {
//		if (view == null) {
//			this.crearVista();
//		}
//		setGraphic(view);
//		labelNombre.setText(item.getNombre());
//
//		cargarImagen(item.getCodigoImagen());
//
//		container.setAlignment(Pos.CENTER);
//		container.setSpacing(5);
//	}
//
//	private void cargarImagen(String nombreImagen) {
//		Image image = null;
//
//		if (nombreImagen == null)
//			image = new Image(getClass().getClassLoader().getResourceAsStream("sinImagen.png"));
//		try {
//			image = new Image(new FileInputStream(
//					Paths.get(settings.index).normalize().toAbsolutePath().toString() + "\\" + nombreImagen + ".png"));
//		} catch (FileNotFoundException e) {
//			image = new Image(getClass().getClassLoader().getResourceAsStream("sinImagen.png"));
//		}
//
//		imagenSimbolo.setImage(image);
//
//		imagenSimbolo.setFitWidth(ANCHO_IMAGEN);
//		imagenSimbolo.setPreserveRatio(true);
//	}
//
//	private void crearVista() {
//		try {
//			FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(FXML_NOMBRE));
//			loader.setController(this);
//			view = loader.load();
//		} catch (Exception e) {
//			System.out.println("Error de lectura archivo fxml organizacion-arbol");
//		}
//
//	}

}
