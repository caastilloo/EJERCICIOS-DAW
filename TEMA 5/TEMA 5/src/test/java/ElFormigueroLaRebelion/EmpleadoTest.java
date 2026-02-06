package ElFormigueroLaRebelion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void cargoInvalido_revisarPte() {
        Empleado e = new Empleado("Juan", "cocinero");
        assertEquals("pte", e.getCargo());
    }

    @Test
    void cargoValido_mantieneCargo() {
        Empleado e = new Empleado("Ana", "presentador");
        assertEquals("presentador", e.getCargo());
    }
}
