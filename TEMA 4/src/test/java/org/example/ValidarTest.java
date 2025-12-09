package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ValidarTest {

    @Test
    void suma_3() {

        // Para seguir testeando aunque encuentre un fallo
        assertAll(
                () -> assertEquals(16, Validar.suma_3(8, 6, 2)),
                () -> assertEquals(-12, Validar.suma_3(-8, -6, 2))
        );

        // Testeo normal pero si falla el primero para de testear
        assertEquals(16, Validar.suma_3(8, 6, 2));
        assertEquals(-12, Validar.suma_3(-8, -6, 2));

    }

    @Test
    void validar() {

        assertTrue(Validar.validar(17) );
        assertFalse(Validar.validar(-9));
        assertTrue(Validar.validar(0));

    }

    @Test
    void cadena() {

        String entradaSimulada = "alessandra";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        Validar.cadena();

        String salidaEsperada = "Hola alessandra";
        assertTrue(salida.toString().contains(salidaEsperada));

    }

}