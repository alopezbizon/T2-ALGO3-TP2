package edu.fiuba.algo3.vista;

import java.io.IOException;

import edu.fiuba.algo3.modelo.BloqueAlgoritmo;
import edu.fiuba.algo3.modelo.BloqueComplejo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
	
	BloqueComplejo modulo = new BloqueAlgoritmo();

    @Override
    public void start(Stage primaryStage) throws IOException {

    	ControladorPrincipal controller = new ControladorPrincipal(modulo);
    	
		FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource("ventana-principal.fxml"));
		loader.setController(controller);
		Parent root = loader.load();
		primaryStage.setTitle("AlgoBlocks");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}