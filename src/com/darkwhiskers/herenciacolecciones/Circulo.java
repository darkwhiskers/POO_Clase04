/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.herenciacolecciones;

public class Circulo extends Figura {
    private final double radio;
    public Circulo(double radio) { this.radio = radio; }

    public double getRadio() { return radio; }

    @Override public double calcularArea()      { return Math.PI * radio * radio; }
    @Override public double calcularPerimetro() { return 2 * Math.PI * radio; }
}
