package ElFormigueroLaRebelion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadenaTest {

    @Test
    void añadirPrograma_agregaProgramaLista() {
        Cadena cadena = new Cadena("Antena 3");
        new Programa("El Hormiguero", cadena);

        assertEquals(1, cadena.getListaProgramas().size());
    }

    @Test
    void eliminarPrograma_eliminaBien() {
        Cadena cadena = new Cadena("Antena 3");
        new Programa("El Hormiguero", cadena);

        cadena.eliminarPrograma("El Hormiguero");

        assertEquals(0, cadena.getListaProgramas().size());
    }
}
