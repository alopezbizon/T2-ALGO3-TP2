package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

public abstract class Bloque {
	
	protected String nombre;

    public abstract void ejecutar(Personaje personaje, Dibujo dibujo);
    public abstract void ejecutarInversa(Personaje personaje, Dibujo dibujo);
    
    public  String getNombreBloque() {
    	return nombre;
    }
}
