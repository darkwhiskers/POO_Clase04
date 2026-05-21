/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.enums;

import java.io.Serializable;

/**
 * Enum que representa los días de la semana.
 *
 * <p>Un enum hereda implícitamente de {@code java.lang.Enum}, no puede
 * heredar de otras clases, pero sí puede implementar interfaces.</p>
 *
 * <p>Internamente Java genera algo equivalente a:<br>
 * {@code private static final Dia[] VALUES = {LUNES, MARTES, ...};}</p>
 * Por eso cada constante tiene una posición (ordinal) y se puede
 * recorrer con {@code values()}.
 */
public enum Dia implements Serializable {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
}
