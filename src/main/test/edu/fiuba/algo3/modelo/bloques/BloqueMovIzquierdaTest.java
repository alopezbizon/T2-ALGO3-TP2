package edu.fiuba.algo3.modelo.bloques;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.bloques.Bloque;
import edu.fiuba.algo3.modelo.bloques.BloqueMovIzquierda;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueMovIzquierdaTest {

    @Test
    public void testBloqueMovIzquierda_deberiaMoverElPersonajeUnaPosicionHaciaLaIzquierda() {
        Posicion posicionInicial = new Posicion(5, 5);
        Posicion posicionFinal = new Posicion(4,5);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueMovIzquierda();
        Dibujo dibujo = new Dibujo();

        bloque.ejecutar(personaje, dibujo);

        assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
    }
}
