package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.bloques.Bloque;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BloqueCell extends ListCell<Bloque> {

	private static final int ANCHO_IMAGEN = 25;
	
	private Node view;
	
	private ImageView imagen = new ImageView();
	
	@Override
	protected void updateItem(Bloque item, boolean empty) {
		super.updateItem(item, empty);

		if (empty) {
			setGraphic(null);
			view = null;
		} else {
			Image image;
			image = new Image(getClass().getClassLoader().getResourceAsStream("images/"+item.getNombreBloque()+".png"));
			imagen.setImage(image);
			imagen.setFitWidth(ANCHO_IMAGEN);
			imagen.setPreserveRatio(true);
			setGraphic(imagen);
		}
	}
}
