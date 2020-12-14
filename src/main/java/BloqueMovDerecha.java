public class BloqueMovDerecha extends Bloque{
    public void accion{
        Personaje personaje = Personaje.darPersonaje();

        personaje.moverDerecha();
    }
}
