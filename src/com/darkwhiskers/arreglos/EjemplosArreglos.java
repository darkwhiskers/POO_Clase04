/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */
package com.darkwhiskers.arreglos;

public class EjemplosArreglos {

    public static void main(String[] args) {

        // ── a) Inicialización directa (tamaño implícito) ──────────────────
        String[] dias = { "Lunes", "Martes", "Miércoles" };
        System.out.println("Días: " + dias.length); // 3

        // ── b) Con new (valores por defecto) ──────────────────────────────
        int[] notas = new int[5];
        notas[0] = 8;   // índice base 0
        notas[1] = 9;
        notas[2] = 7;
        notas[3] = 10;
        notas[4] = 6;   // índice máximo: length - 1

        // ── c) Bidimensional (matriz) ─────────────────────────────────────
        int[][] matriz = new int[3][4];
        matriz[0][0] = 1;

        // ── Recorrido: for clásico (accede por índice) ────────────────────
        System.out.println("\n-- For clásico --");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "] = " + notas[i]);
        }

        // ── Recorrido: for-each (más limpio, sin índice) ──────────────────
        System.out.println("\n-- For-each --");
        for (int nota : notas) {
            System.out.println(nota);
        }

        // ── Arreglo de objetos ────────────────────────────────────────────
        System.out.println("\n-- Arreglo de Gatos --");
        Gato[] gatos = new Gato[3];          // 1. el arreglo existe; sus elementos son null
        gatos[0] = new Gato("Mamba",  "Negra",  5);
        gatos[1] = new Gato("Siamés", "Gris",   2);
        gatos[2] = new Gato("Gatito", "Blanco", 4);

        for (Gato g : gatos) {
            g.maullar();
        }

        // ── Pasar arreglo a método (se pasa la referencia, no una copia) ──
        double[] temps = new double[3];
        modificar(temps);
        System.out.println("\ntemps[0] después de modificar(): " + temps[0]); // 36.5

        // ── ArrayIndexOutOfBoundsException (descomentá para probar) ───────
        // System.out.println(notas[10]); // lanza excepción
    }

    /** Modifica el arreglo original a través de su referencia. */
    static void modificar(double[] v) {
        v[0] = 36.5;
    }
}
