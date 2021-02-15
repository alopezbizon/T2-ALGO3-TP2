package edu.fiuba.algo3.modelo;

public class BloqueAlgoritmo extends BloqueComplejo {

	private String nombre;

	@Override
	public void ejecutar(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.ejecutar(personaje, dibujo);
		});
	}

	public void inicializarNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerNombre() {
		return this.nombre;
	}
}
