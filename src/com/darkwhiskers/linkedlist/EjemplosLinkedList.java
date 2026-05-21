/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.linkedlist;

import java.util.LinkedList;

/**
 * Ejemplos de uso de LinkedList y sus métodos exclusivos.
 * Clase 04 - Arreglos y Colecciones.
 */
public class EjemplosLinkedList {

    public static void main(String[] args) {

        LinkedList<String> cola = new LinkedList<>();

        cola.add("A");
        cola.add("B");
        cola.add("C");

        cola.addFirst("Inicio");   // inserta al principio
        cola.addLast("Final");     // inserta al final
        // → [Inicio, A, B, C, Final]
        System.out.println("Lista: " + cola);

        System.out.println("getFirst(): " + cola.getFirst()); // Inicio
        System.out.println("getLast():  " + cola.getLast());  // Final

        cola.removeFirst(); // elimina el primero
        cola.removeLast();  // elimina el último
        // → [A, B, C]
        System.out.println("Después de removes: " + cola);

        // ── Uso como cola (FIFO) ──────────────────────────────────────────
        System.out.println("\n-- Uso como cola FIFO --");
        LinkedList<String> fifo = new LinkedList<>();
        fifo.offer("Primero");
        fifo.offer("Segundo");
        fifo.offer("Tercero");

        while (!fifo.isEmpty()) {
            System.out.println("poll(): " + fifo.poll()); // extrae desde el frente
        }

        // ── Uso como pila (LIFO) ──────────────────────────────────────────
        System.out.println("\n-- Uso como pila LIFO --");
        LinkedList<String> pila = new LinkedList<>();
        pila.push("Primero");
        pila.push("Segundo");
        pila.push("Tercero");

        while (!pila.isEmpty()) {
            System.out.println("pop(): " + pila.pop()); // extrae desde arriba
        }
    }
}
