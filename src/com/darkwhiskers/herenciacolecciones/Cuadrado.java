/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.herenciacolecciones;

public class Cuadrado extends Figura {
    private final double lado;
    public Cuadrado(double lado) { this.lado = lado; }

    @Override public double calcularArea()      { return lado * lado; }
    @Override public double calcularPerimetro() { return 4 * lado; }
}
