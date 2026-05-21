/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since ©2026
 */
package com.darkwhiskers.arreglos;

public class Gato {

    private String nombre;
    private String color;
    private int    edad;

    public Gato(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color  = color;
        this.edad   = edad;
    }

    public void maullar() {
        System.out.println(nombre + " (" + color + ", " + edad + " años): ¡Miau!");
    }

    // ── Getters y Setters ────────────────────────────────────────────────

    public String getNombre() { return nombre; }
    public void   setNombre(String nombre) { this.nombre = nombre; }

    public String getColor()  { return color; }
    public void   setColor(String color)   { this.color = color; }

    public int    getEdad()   { return edad; }
    public void   setEdad(int edad)        { this.edad = edad; }

    @Override
    public String toString() {
        return "Gato{nombre='" + nombre + "', color='" + color + "', edad=" + edad + "}";
    }
}
