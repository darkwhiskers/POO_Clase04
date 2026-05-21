/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */
package com.darkwhiskers.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemplosArrayList {

    public static void main(String[] args) {

        // ── Métodos principales ───────────────────────────────────────────
        ArrayList<String> ap = new ArrayList<>();

        System.out.println("¿Vacía? " + ap.isEmpty()); // true

        ap.add("Lopez");
        ap.add("Martinez");
        ap.add(0, "Alvarez");    // inserta al inicio
        ap.add("Garcia");
        // → [Alvarez, Lopez, Martinez, Garcia]
        System.out.println("Lista: " + ap);

        System.out.println("indexOf Martinez: " + ap.indexOf("Martinez")); // 2
        System.out.println("contains Perez:   " + ap.contains("Perez"));   // false
        System.out.println("get(1):           " + ap.get(1));               // Lopez

        ap.set(1, "Rodriguez");  // reemplaza Lopez por Rodriguez
        System.out.println("Después de set:   " + ap);

        ap.remove(1);            // elimina por índice (Rodriguez)
        ap.remove("Alvarez");    // elimina por valor
        // → [Martinez, Garcia]
        System.out.println("Después de removes: " + ap);

        System.out.println("size(): " + ap.size());

        // ── Recorrido 1: For clásico ──────────────────────────────────────
        System.out.println("\n-- For clásico --");
        for (int i = 0; i < ap.size(); i++) {
            System.out.print(ap.get(i) + " ");
        }

        // ── Recorrido 2: For-each ─────────────────────────────────────────
        System.out.println("\n-- For-each --");
        for (String s : ap) {
            System.out.print(s + " ");
        }

        // ── Recorrido 3: Iterator (seguro para eliminar) ──────────────────
        System.out.println("\n-- Iterator (elimina los que empiezan con 'M') --");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Martinez");
        lista.add("Garcia");
        lista.add("Morales");
        lista.add("Perez");

        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.startsWith("M")) {
                it.remove(); // ← seguro, no lanza ConcurrentModificationException
            }
        }
        System.out.println("Después de filtrar: " + lista); // [Garcia, Perez]

        // ── clear() ───────────────────────────────────────────────────────
        ap.clear();
        System.out.println("\nDespués de clear(), isEmpty: " + ap.isEmpty());
    }
}
