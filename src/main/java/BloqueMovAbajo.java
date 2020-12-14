public class BloqueMovAbajo extends Bloque {
    public void accion{
        Personaje personaje = Personaje.darPersonaje();

        personaje.moverAbajo();
    }
}
