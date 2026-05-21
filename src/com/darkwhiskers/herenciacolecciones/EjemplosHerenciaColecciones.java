/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.herenciacolecciones;

import java.util.ArrayList;

// Demuestra polimorfismo con ArrayList y arreglos estáticos
// de superclase, y el uso correcto de instanceof.

public class EjemplosHerenciaColecciones {

    public static void main(String[] args) {

        // ── Polimorfismo con ArrayList ────────────────────────────────────
        System.out.println("=== ArrayList<Figura> ===");
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(5.0));
        figuras.add(new Circulo(3.0));
        figuras.add(new Triangulo(4.0, 6.0));

        // Polimorfismo: cada figura ejecuta su propio calcularArea() en runtime
        for (Figura f : figuras) {
            System.out.printf("%-12s  área: %6.2f   perímetro: %6.2f%n",
                f.getClass().getSimpleName(),
                f.calcularArea(),
                f.calcularPerimetro());
        }

        // ── Arreglo estático de superclase ────────────────────────────────
        System.out.println("\n=== Figura[] (arreglo estático) ===");
        Figura[] figs = {
            new Cuadrado(4.0),
            new Circulo(2.5),
            new Triangulo(3.0, 5.0)
        };

        for (Figura f : figs) {
            System.out.printf("%-15s Área: %.2f%n",
                f.getClass().getSimpleName(),
                f.calcularArea());
        }

        // ── instanceof: acceder a métodos propios de subclase ─────────────
        System.out.println("\n=== instanceof ===");
        Figura[] mixto = {
            new Circulo(5),
            new Cuadrado(4),
            new Triangulo(3, 4)
        };

        for (Figura f : mixto) {
            if (f instanceof Circulo) {
                Circulo c = (Circulo) f;          // cast seguro
                System.out.println("Circulo - radio: " + c.getRadio());
            }
            /* Java 16+ pattern matching (equivalente al bloque anterior):
            if (f instanceof Circulo c) {
                System.out.println(c.getRadio());
            }
            */

            // Polimorfismo para el área (sin instanceof):
            System.out.printf("  → calcularArea(): %.2f%n", f.calcularArea());
        }
    }
}
