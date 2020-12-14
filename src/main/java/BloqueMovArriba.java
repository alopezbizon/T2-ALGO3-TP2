public class BloqueMovArriba extends Bloque {
    public void accion{
        Personaje personaje = Personaje.darPersonaje();

        personaje.moverArriba();
    }
}
