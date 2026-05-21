/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.treeset;

import java.util.TreeSet;

/**
 * Ejemplos de uso de TreeSet: colección ordenada sin duplicados.
 * Clase 04 - Arreglos y Colecciones.
 */
public class EjemplosTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> tr = new TreeSet<>();

        tr.add(63);
        tr.add(12);
        tr.add(45);
        tr.add(34);
        tr.add(12); // duplicado: se ignora silenciosamente

        System.out.println("TreeSet: " + tr);          // [12, 34, 45, 63]
        System.out.println("first(): " + tr.first());  // 12 (el menor)
        System.out.println("last():  " + tr.last());   // 63 (el mayor)

        // ── Métodos de navegación ─────────────────────────────────────────
        System.out.println("floor(40):   " + tr.floor(40));    // 34 (≤ 40)
        System.out.println("ceiling(40): " + tr.ceiling(40));  // 45 (≥ 40)
        System.out.println("headSet(45): " + tr.headSet(45));  // [12, 34]  (< 45)
        System.out.println("tailSet(34): " + tr.tailSet(34));  // [34, 45, 63] (≥ 34)

        // ── TreeSet de Strings (orden lexicográfico) ──────────────────────
        System.out.println("\n-- TreeSet<String> --");
        TreeSet<String> nombres = new TreeSet<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Beatriz");
        nombres.add("Ana"); // duplicado
        System.out.println("Nombres ordenados: " + nombres); // [Ana, Beatriz, Carlos]
    }
}
