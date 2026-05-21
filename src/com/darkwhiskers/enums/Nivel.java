/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.enums;

public enum Nivel {

    BAJO(1),
    MEDIO(2),
    ALTO(3);

    // ── Atributo ──────────────────────────────────────────────────────────
    private final int prioridad;

    // ── Constructor (siempre private en enums) ────────────────────────────
    private Nivel(int prioridad) {
        this.prioridad = prioridad;
    }

    // ── Getter ────────────────────────────────────────────────────────────
    public int getPrioridad() {
        return prioridad;
    }
}
