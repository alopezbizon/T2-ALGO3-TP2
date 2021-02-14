package edu.fiuba.algo3.modelo;

public abstract class BloqueRepetir extends BloqueComplejo {

	protected int cantidadRepeticiones;

	@Override
	public void ejecutar(Personaje personaje, Dibujo dibujo) {
		for (int i = 0; i < cantidadRepeticiones; i++) {

			bloques.forEach(bloque -> {
				bloque.ejecutar(personaje, dibujo);
			});
		}
	}

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		for (int i = 0; i < cantidadRepeticiones; i++) {

			bloques.forEach(bloque -> {
				bloque.ejecutarInversa(personaje, dibujo);
			});
		}

	}
}
