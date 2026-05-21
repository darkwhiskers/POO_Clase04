/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.herenciacolecciones;

public class Triangulo extends Figura {
    private final double base;
    private final double altura;
    private final double ladoA;
    private final double ladoB;
    private final double ladoC;

    /** Constructor para área y perímetro (triángulo rectángulo). */
    public Triangulo(double base, double altura) {
        this.base   = base;
        this.altura = altura;
        // Hipotenusa calculada para el perímetro
        this.ladoA  = base;
        this.ladoB  = altura;
        this.ladoC  = Math.sqrt(base * base + altura * altura);
    }

    @Override public double calcularArea()      { return (base * altura) / 2; }
    @Override public double calcularPerimetro() { return ladoA + ladoB + ladoC; }
}
