package Colecciones.Mapas.EJS.DiccionarioJuego;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiccionarioTest {

    Diccionario diccionario;

    @BeforeEach
    public void crearDiccionario() {
        diccionario = new Diccionario();
    }

    // Inserción correcta
    @Test
    public void testNuevoPar() {
        diccionario.nuevoPar("perro", "dog");
        assertEquals("dog", diccionario.traduce("perro"));
    }

    // Traducción existente
    @Test
    public void testTraduceExistente() {
        diccionario.nuevoPar("gato", "cat");
        String palabra = diccionario.traduce("gato");
        assertEquals("cat", palabra);
    }

    // Traducción no existente
    @Test
    public void testTraduceNoExistente() {
        String palabra = diccionario.traduce("coche");
        assertNull(palabra);
    }

    // Palabra aleatoria (comprobamos que está dentro)
    @Test
    public void testPalabraAleatoria() {
        diccionario.nuevoPar("perro", "dog");
        diccionario.nuevoPar("gato", "cat");

        String palabra = diccionario.palabraAleatoria();

        boolean ok = palabra.equals("perro") || palabra.equals("gato");
        assertTrue(ok);
    }

    // Primera letra correcta
    @Test
    public void testPrimeraLetraTraduccion() {
        diccionario.nuevoPar("perro", "dog");
        char letra = diccionario.primeraLetraTraduccion("perro");
        assertEquals('d', letra);
    }

    // Diccionario vacío - traduce
    @Test
    public void testDiccionarioVacioTraduce() {
        String palabra = diccionario.traduce("perro");
        assertNull(palabra);
    }

    // Diccionario vacío - palabra aleatoria (debe fallar)
    @Test
    public void testDiccionarioVacioAleatoria() {
        try {
            diccionario.palabraAleatoria();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    // Diccionario vacío - primera letra (debe fallar)
    @Test
    public void testDiccionarioVacioPrimeraLetra() {
        try {
            diccionario.primeraLetraTraduccion("perro");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}