package edu.fiuba.algo3.modelo.bloques;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tramo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class BloqueAlgoritmoTest {

	private BloqueAlgoritmo algoritmo;
	private Personaje personaje;
	private Dibujo dibujo;
	private Tramo tramoMovAbajo;
	private Tramo tramoMovArriba;
	private Tramo tramoMovIzquierda;
	private Tramo tramoMovDerecha;

	private Posicion posicionInicial;
	private Posicion posicionFinal;
	
	private BloqueRepetir bloqueRepetir;
	
	@BeforeEach
	public void init() throws Exception {
		algoritmo = new BloqueAlgoritmo();
		posicionInicial = new Posicion(0,0);
		personaje = new Personaje(new Posicion(0,0));
		dibujo = new Dibujo();
		tramoMovAbajo = new Tramo(new Posicion(0,0),new Posicion(0,-1));
		tramoMovArriba = new Tramo(new Posicion(0,0),new Posicion(0,1));
		tramoMovIzquierda = new Tramo(new Posicion(0,0),new Posicion(-1,0));
		tramoMovDerecha = new Tramo(new Posicion(0,0),new Posicion(1,0));
	}
	
	@Test
	public void testCrearAlgoritmoVacio() {		
		
		algoritmo.ejecutar(personaje, null);
		
		posicionFinal = posicionInicial;
		assertTrue(personaje.obtenerPosicion().equals(posicionInicial));
	}
	
	@Test
	public void testAgregarUnBloqueMovimientoAbajo() {
		posicionFinal = new Posicion(0,-1);
				
		algoritmo.agregarBloque(new BloqueMovAbajo());		
		algoritmo.ejecutar(personaje, null);

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueMovimientoArriba() {
		posicionFinal = new Posicion(0,1);

		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.ejecutar(personaje, null);

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueMovimientoIzquierda() {
		posicionFinal = new Posicion(-1,0);

		algoritmo.agregarBloque(new BloqueMovIzquierda());
		algoritmo.ejecutar(personaje, null);

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueMovimientoDerecha() {
		posicionFinal = new Posicion(1,0);

		algoritmo.agregarBloque(new BloqueMovDerecha());
		algoritmo.ejecutar(personaje, null);

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueBajarLapizYMovAbajoGeneraUnTramo() {
		posicionFinal = new Posicion(0,-1);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueBajarLapiz());
		algoritmo.agregarBloque(new BloqueMovAbajo());
		algoritmo.ejecutar(personaje, dibujo);
		assertFalse(dibujo.obtenerTramos().isEmpty());

		assertTrue(dibujo.contieneTramo(tramoMovAbajo));
		assertEquals(dibujo.obtenerTramos().size(), 1);
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueBajarLapizYMovArribaGeneraUnTramo() {
		posicionFinal = new Posicion(0,1);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueBajarLapiz());
		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.ejecutar(personaje, dibujo);
		assertFalse(dibujo.obtenerTramos().isEmpty());

		assertTrue(dibujo.contieneTramo(tramoMovArriba));
		assertEquals(dibujo.obtenerTramos().size(), 1);
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueBajarLapizYMovIzquierdaGeneraUnTramo() {
		posicionFinal = new Posicion(-1,0);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueBajarLapiz());
		algoritmo.agregarBloque(new BloqueMovIzquierda());
		algoritmo.ejecutar(personaje, dibujo);
		assertFalse(dibujo.obtenerTramos().isEmpty());

		assertTrue(dibujo.contieneTramo(tramoMovIzquierda));
		assertEquals(dibujo.obtenerTramos().size(), 1);
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueBajarLapizYMovDerechaGeneraUnTramo() {
		posicionFinal = new Posicion(1,0);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueBajarLapiz());
		algoritmo.agregarBloque(new BloqueMovDerecha());
		algoritmo.ejecutar(personaje, dibujo);
		assertFalse(dibujo.obtenerTramos().isEmpty());

		assertTrue(dibujo.contieneTramo(tramoMovDerecha));
		assertEquals(dibujo.obtenerTramos().size(), 1);
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueSubirLapizYMovAbajoNoPintaElSectorDibujo() {
		posicionFinal = new Posicion(0,-1);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueSubirLapiz());
		algoritmo.agregarBloque(new BloqueMovAbajo());
		algoritmo.ejecutar(personaje, dibujo);

		assertFalse(dibujo.contieneTramo(tramoMovAbajo));
		assertTrue(dibujo.obtenerTramos().isEmpty());
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueSubirLapizYMovArribaNoPintaElSectorDibujo() {
		posicionFinal = new Posicion(0,1);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueSubirLapiz());
		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.ejecutar(personaje, dibujo);

		assertFalse(dibujo.contieneTramo(tramoMovArriba));
		assertTrue(dibujo.obtenerTramos().isEmpty());
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueSubirLapizYMovIzquierdaNoPintaElSectorDibujo() {
		posicionFinal = new Posicion(-1,0);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueSubirLapiz());
		algoritmo.agregarBloque(new BloqueMovIzquierda());
		algoritmo.ejecutar(personaje, dibujo);

		assertFalse(dibujo.contieneTramo(tramoMovIzquierda));
		assertTrue(dibujo.obtenerTramos().isEmpty());
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

	@Test
	public void testAgregarUnBloqueSubirLapizYMovDerechaNoPintaElSectorDibujo() {
		posicionFinal = new Posicion(1,0);

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueSubirLapiz());
		algoritmo.agregarBloque(new BloqueMovDerecha());
		algoritmo.ejecutar(personaje, dibujo);

		assertFalse(dibujo.contieneTramo(tramoMovDerecha));
		assertTrue(dibujo.obtenerTramos().isEmpty());
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void testAgregarDosBloquesVuelveAlaPosicionInicialYNoPintaElSectorDibujo() {
		posicionFinal = posicionInicial;

		algoritmo.agregarBloque(new BloqueMovAbajo());		
		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.ejecutar(personaje, dibujo);

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
		assertTrue(dibujo.obtenerTramos().isEmpty());
	}

	@Test
	public void testAgregarBloquesVuelveAlaPosicionInicialYPintaElSectorDibujo() throws Exception {
		posicionFinal = posicionInicial;
		List<Tramo> tramos = new ArrayList<>(List.of(
				new Tramo(new Posicion(0,0), new Posicion(1,0)),
				new Tramo(new Posicion(1,0), new Posicion(1,1)),
				new Tramo(new Posicion(1,1), new Posicion(0,1)),
				new Tramo(new Posicion(0,1), new Posicion(0,0))
		));

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueBajarLapiz());
		algoritmo.agregarBloque(new BloqueMovDerecha());
		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.agregarBloque(new BloqueMovIzquierda());
		algoritmo.agregarBloque(new BloqueMovAbajo());
		algoritmo.ejecutar(personaje, dibujo);
		assertFalse(dibujo.obtenerTramos().isEmpty());

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
		List<Tramo> tramosCreados = dibujo.obtenerTramos();
		tramosCreados.forEach(tramoCreado -> assertTrue(
				tramos.stream().anyMatch(unTramo -> unTramo.equals(tramoCreado))));
		assertEquals(tramosCreados.size(), tramos.size());
	}

	@Test
	public void testAgregarBloquesVuelveAlaPosicionInicialYPintaElSectorDibujoSegunCorresponda() throws Exception {
		posicionFinal = posicionInicial;
		List<Tramo> tramos = new ArrayList<>(List.of(
				new Tramo(new Posicion(1,0), new Posicion(1,1)),
				new Tramo(new Posicion(0,1), new Posicion(0,0))
		));

		assertTrue(dibujo.obtenerTramos().isEmpty());
		algoritmo.agregarBloque(new BloqueMovDerecha());
		algoritmo.agregarBloque(new BloqueBajarLapiz());
		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.agregarBloque(new BloqueSubirLapiz());
		algoritmo.agregarBloque(new BloqueMovIzquierda());
		algoritmo.agregarBloque(new BloqueBajarLapiz());
		algoritmo.agregarBloque(new BloqueMovAbajo());
		algoritmo.ejecutar(personaje, dibujo);
		assertFalse(dibujo.obtenerTramos().isEmpty());

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
		List<Tramo> tramosCreados = dibujo.obtenerTramos();
		tramosCreados.forEach(tramoCreado -> assertTrue(
				tramos.stream().anyMatch(unTramo -> unTramo.equals(tramoCreado))));
		assertEquals(tramosCreados.size(), tramos.size());
	}
	
	@Test
	public void testAgregoBloqueMovArribaYBloqueConRepeticionDosVeces() {
		
		algoritmo.agregarBloque(new BloqueMovAbajo());
		
		bloqueRepetir = new BloqueRepetirDosVeces();
		bloqueRepetir.agregarBloque(new BloqueMovDerecha());
		
		algoritmo.agregarBloque(bloqueRepetir);
		
		algoritmo.ejecutar(personaje, null);

		posicionFinal = new Posicion(2,-1);
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void testBloqueAlgoritmoPersonalizadoInicializarNombre() {
		BloqueAlgoritmo algoritmoMock = mock(BloqueAlgoritmo.class);

		algoritmoMock.inicializarNombre("Pintar Cuadrado");

		verify(algoritmoMock,times(1)).inicializarNombre("Pintar Cuadrado");
	}

	@Test
	public void testBloqueAlgoritmoPersonalizadoObtenerNombre() {
		BloqueAlgoritmo algoritmo = new BloqueAlgoritmo();

		algoritmo.inicializarNombre("Pintar Cuadrado");
		algoritmo.obtenerNombre();

		assertEquals(algoritmo.obtenerNombre(),"Pintar Cuadrado");
	}

}
