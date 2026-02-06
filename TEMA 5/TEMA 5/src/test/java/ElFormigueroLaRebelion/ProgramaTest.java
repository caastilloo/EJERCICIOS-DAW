package ElFormigueroLaRebelion;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaTest {

    private Programa programa;
    private Cadena cadena;
    private Empleado director;

    @Test
    void buscarInvitado_True_siExiste() {
        programa.getListaInvitados().add(
                new Invitado("Aitana", "cantante", 1, LocalDate.of(2023, 5, 10))
        );

        assertTrue(programa.buscarInvitado("Aitana"));
    }

    @Test
    void buscarInvitado_False_siNoExiste() {
        assertFalse(programa.buscarInvitado("Pablo"));
    }

    @Test
    void vecesInvitado_cuentaBien() {
        programa.getListaInvitados().add(
                new Invitado("Aitana", "cantante", 1, LocalDate.of(2022, 1, 1))
        );
        programa.getListaInvitados().add(
                new Invitado("Aitana", "cantante", 2, LocalDate.of(2023, 1, 1))
        );

        assertEquals(2, programa.vecesInvitado("Aitana"));
    }

    @Test
    void anadirEmpleado_incrementaLista() {
        programa.anadirEmpleado("Pablo Motos", "presentador");

        assertEquals(2, programa.getListaEmpleados().size());
    }

    @Test
    void invitadoAntes_noErrores() {
        Programa otro = new Programa(
                "La Rebelión",
                new Cadena("Movistar"),
                5,
                new Empleado("Director 2", "director")
        );

        programa.getListaInvitados().add(
                new Invitado("Aitana", "cantante", 1, LocalDate.of(2022, 1, 1))
        );
        otro.getListaInvitados().add(
                new Invitado("Aitana", "cantante", 1, LocalDate.of(2023, 1, 1))
        );

        programa.invitadoAntes("Aitana", otro);
    }
}
