public class BloqueMovIzquierda extends Bloque {
    public void accion{
        Personaje personaje = Personaje.darPersonaje();

        personaje.moverIzquierda();
    }
}
