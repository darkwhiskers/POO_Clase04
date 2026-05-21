/**
 * @author  Mamba & Mike
 * Visit: https://darkwhiskers.org/
 * Repository: https://github.com/darkwhiskers
 * @since   ©2026
*/

package com.darkwhiskers;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws Exception {
        // Con este objeto podemos mosttrar los caracteres propios de ASCCI,
        // es decir, letras con tildes y caracteres especiales.
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║   POO - Clase 04: Arreglos y Colecciones   ║");
        System.out.println("╚════════════════════════════════════════════════════╝");

        System.out.println("\n▶ EjemplosArreglos");
        com.darkwhiskers.arreglos.EjemplosArreglos.main(args);

        System.out.println("\n▶ Ejemplos ArrayList:");
        com.darkwhiskers.arraylist.EjemplosArrayList.main(args);

        System.out.println("\n▶ Ejemplos LinkedList:");
        com.darkwhiskers.linkedlist.EjemplosLinkedList.main(args);

        System.out.println("\n▶ Ejemplos TreeSet:");
        com.darkwhiskers.treeset.EjemplosTreeSet.main(args);

        System.out.println("\n▶ Ejemplos Enum:");
        com.darkwhiskers.enums.EjemplosEnum.main(args);

        System.out.println("\n▶ Ejemplos Herencia-Colecciones:");
        com.darkwhiskers.herenciacolecciones.EjemplosHerenciaColecciones.main(args);
    }

}
