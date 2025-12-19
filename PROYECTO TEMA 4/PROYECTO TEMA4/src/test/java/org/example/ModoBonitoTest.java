package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModoBonitoTest {

    @Test
    void matrizTriangularSuperior() {
        int[][] matriz = {
                {1, 2, 3},
                {0, 5, 0},
                {0, 0, 9}
        };

        assertTrue(ModoBonito.comprobarTriangular(matriz));
    }

    @Test
    void matrizTriangularInferior() {
        int[][] matriz = {
                {1, 0, 0},
                {4, 5, 0},
                {7, 8, 9}
        };

        assertTrue(ModoBonito.comprobarTriangular(matriz));
    }

    @Test
    void matrizNoTriangular() {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 9}
        };

        assertFalse(ModoBonito.comprobarTriangular(matriz));
    }
}
