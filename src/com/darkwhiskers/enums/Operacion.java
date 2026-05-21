/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers.enums;

public enum Operacion {

    SUMA {
        @Override
        public int aplicar(int a, int b) {
            return a + b;
        }
    },
    RESTA {
        @Override
        public int aplicar(int a, int b) {
            return a - b;
        }
    },
    MULTIPLICACION {
        @Override
        public int aplicar(int a, int b) {
            return a * b;
        }
    },
    DIVISION {
        @Override
        public int aplicar(int a, int b) {
            if (b == 0) throw new ArithmeticException("División por cero");
            return a / b;
        }
    };

    /** Método abstracto que cada constante debe implementar.
     * @param a
     * @param b
     * @return  */
    public abstract int aplicar(int a, int b);
}
