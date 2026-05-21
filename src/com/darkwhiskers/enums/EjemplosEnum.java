/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.enums;

public class EjemplosEnum {

    public static void main(String[] args) {

        // ── values(): recorrer todas las constantes ───────────────────────
        System.out.println("=== values() ===");
        for (Dia d : Dia.values()) {
            System.out.println(d);
        }

        // ── ordinal(): posición de la constante (base 0) ──────────────────
        System.out.println("\n=== ordinal() ===");
        System.out.println("MARTES ordinal: " + Dia.MARTES.ordinal()); // 1

        // ── name(): nombre de la constante como String ────────────────────
        System.out.println("\n=== name() ===");
        System.out.println("MIERCOLES name: " + Dia.MIERCOLES.name()); // "MIERCOLES"

        // ── valueOf(String): obtener constante desde un String ────────────
        System.out.println("\n=== valueOf() ===");
        Dia d = Dia.valueOf("LUNES");
        System.out.println("valueOf(\"LUNES\"): " + d); // LUNES
        // ⚠ Dia.valueOf("lunes") lanzaría IllegalArgumentException

        // ── Uso en switch (más seguro que int o String) ───────────────────
        System.out.println("\n=== switch con enum ===");
        Dia hoy = Dia.VIERNES;
        switch (hoy) {
            case LUNES -> System.out.println("Inicio de semana");
            case MIERCOLES -> System.out.println("Mitad de semana");
            case VIERNES -> System.out.println("¡Finde cerca!");
            case SABADO, DOMINGO -> System.out.println("¡Fin de semana!");
            default -> System.out.println("Día laborable");
        }

        // ── Enum con atributos y constructor (Nivel) ──────────────────────
        System.out.println("\n=== Enum con atributos: Nivel ===");
        Nivel n = Nivel.ALTO;
        System.out.println("Nivel: " + n + ", prioridad: " + n.getPrioridad()); // 3

        for (Nivel nivel : Nivel.values()) {
            System.out.println(nivel + " → prioridad " + nivel.getPrioridad());
        }

        // ── Enum con métodos abstractos (Operacion) ───────────────────────
        System.out.println("\n=== Enum con métodos abstractos: Operacion ===");
        int r = Operacion.RESTA.aplicar(5, 3);
        int s = Operacion.SUMA.aplicar(14, 6);
        System.out.println("RESTA(5, 3)  = " + r); // 2
        System.out.println("SUMA(14, 6)  = " + s); // 20

        // Recorrer todas las operaciones
        int a = 10, b = 2;
        for (Operacion op : Operacion.values()) {
            System.out.printf("%-15s aplicar(%d, %d) = %d%n", op, a, b, op.aplicar(a, b));
        }
    }
}
