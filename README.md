# POO – Clase 04: Arreglos y Colecciones

Este repositorio acompaña la presentación de la **Clase 04** sobre arreglos y colecciones. Contiene
ejemplos ejecutables de cada tema cubierto.

---

## Temas

| # | Tema | Paquete |
|---|------|---------|
| 1 | Arreglos (arrays) | `arreglos` |
| 2 | ArrayList | `arraylist` |
| 3 | LinkedList | `linkedlist` |
| 4 | TreeSet | `treeset` |
| 5 | enum | `enums` |
| 6 | Herencia + Colecciones · instanceof | `herenciacolecciones` |

---

## Estructura del proyecto

```
POO_Clase04_aux/
└── src/
    └── com/
        └── darkwhiskers/
            ├── Main.java                          ← punto de entrada
            ├── arreglos/
            │   ├── EjemplosArreglos.java
            │   └── Gato.java
            ├── arraylist/
            │   └── EjemplosArrayList.java
            ├── linkedlist/
            │   └── EjemplosLinkedList.java
            ├── treeset/
            │   └── EjemplosTreeSet.java
            ├── enums/
            │   ├── Dia.java
            │   ├── Nivel.java
            │   ├── Operacion.java
            │   └── EjemplosEnum.java
            └── herenciacolecciones/
                ├── Figura.java
                ├── Cuadrado.java
                ├── Circulo.java
                ├── Triangulo.java
                └── EjemplosHerenciaColecciones.java
```

---

## DESCRIPCIÓN DE CADA MÓDULO:

### 1 · Arreglos (`arreglos`)

- Declaración e inicialización (directa, con `new`, bidimensional).
- `length` como atributo (sin paréntesis).
- Recorrido con `for` clásico y `for-each`.
- Arreglo de objetos (`Gato[]`): cada posición almacena una **referencia**.
- Paso de arreglos a métodos (se pasa la referencia, no una copia).
- Excepción `ArrayIndexOutOfBoundsException`.

---

### 2 · ArrayList (`arraylist`)

- Métodos principales: `add`, `get`, `set`, `remove`, `size`, `isEmpty`,
  `contains`, `indexOf`, `clear`.
- Tres formas de recorrido:

  | Forma | Acceso a índice | Eliminar durante recorrido | Cuándo usarla |
  |-------|:-:|:-:|---|
  | `for` clásico | ✓ | ✗ (con cuidado) | Necesita índice o modificar posiciones |
  | `for-each` | ✗ | ✗ (lanza excepción) | Solo leer todos los elementos |
  | `Iterator` | ✗ | ✓ | Filtrar o eliminar durante el recorrido |

- `ConcurrentModificationException`: ocurre al usar `lista.remove()` dentro
  de un `for-each`. Solución: usar `Iterator` y llamar a `it.remove()`.

---

### 3 · LinkedList (`linkedlist`)

- Lista doblemente enlazada.
- Métodos exclusivos: `addFirst`, `addLast`, `getFirst`, `getLast`,
  `removeFirst`, `removeLast`.
- Uso como **cola FIFO** (`offer` / `poll`) y **pila LIFO** (`push` / `pop`).
- Comparación con ArrayList:

  | Operación | ArrayList | LinkedList |
  |-----------|-----------|------------|
  | `get(i)` por índice | O(1) rápido | O(n) lento |
  | Insertar al inicio | O(n) lento | O(1) rápido |
  | Insertar al final | O(1) rápido | O(1) rápido |
  | Insertar en el medio | Lento | Rápido |
  | Memoria | Menor | Mayor (punteros) |

---

### 4 · TreeSet (`treeset`)

- Colección ordenada sin duplicados.
- Métodos de navegación: `first()`, `last()`, `floor()`, `ceiling()`,
  `headSet()`, `tailSet()`.
- Comparación de implementaciones de `Set`:

  | Implementación | Orden | Duplicados | Rendimiento |
  |----------------|-------|:-:|------------|
  | `HashSet` | Sin orden | ✗ | Más rápido |
  | `TreeSet` | Ordenado | ✗ | Más lento |
  | `LinkedHashSet` | Inserción | ✗ | Intermedio |

---

### 5 · enum (`enums`)

Un `enum` es un tipo especial de clase que representa un **conjunto fijo
de constantes con nombre**. Hereda implícitamente de `java.lang.Enum`,
no puede heredar de otras clases pero sí implementar interfaces.

#### Clases incluidas

| Archivo | Concepto demostrado |
|---------|---------------------|
| `Dia.java` | Enum básico que implementa `Serializable` |
| `Nivel.java` | Enum con **atributo**, **constructor privado** y getter |
| `Operacion.java` | Enum con **método abstracto** sobrescrito por cada constante |
| `EjemplosEnum.java` | Demo de todos los métodos heredados y casos de uso |

#### Métodos heredados de `java.lang.Enum`

```java
// values(): recorre todas las constantes
for (Dia d : Dia.values()) { ... }

// ordinal(): posición base 0
Dia.MARTES.ordinal();          // → 1

// name(): nombre como String
Dia.MIERCOLES.name();          // → "MIERCOLES"

// valueOf(String): constante desde texto (lanza excepción si no existe)
Dia d = Dia.valueOf("LUNES");
```

#### Enum con atributos y constructor (`Nivel`)

```java
Nivel n = Nivel.ALTO;
n.getPrioridad(); // → 3
```

> El constructor de un enum es **siempre `private`**, aunque no se escriba
> explícitamente.

#### Enum con métodos abstractos (`Operacion`)

```java
int r = Operacion.RESTA.aplicar(5, 3);  // 2
int s = Operacion.SUMA.aplicar(14, 6);  // 20
```

Cada constante sobreescribe `aplicar()`, funcionando como un patrón
**Strategy** sin clases adicionales.

#### Uso en `switch`

```java
Dia hoy = Dia.VIERNES;
switch (hoy) {
    case VIERNES: System.out.println("¡Finde cerca!"); break;
    ...
}
```

> Más seguro y legible que usar `int` o `String`.

---

### 6 · Herencia + Colecciones (`herenciacolecciones`)

- Lista polimórfica: `ArrayList<Figura>` contiene `Cuadrado`, `Circulo` y
  `Triangulo`. El método `calcularArea()` correcto se resuelve en **runtime**.
- Arreglo estático de superclase (`Figura[]`).
- Operador `instanceof`: cuándo usarlo y cuándo **no** abusar de él.
- Pattern matching de Java 16+: `if (f instanceof Circulo c) { ... }`.

---

## Cómo usar estos ejemplos

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/darkwhiskers/POO_Clase04.git
   ```

2. **Compilar desde la raíz del proyecto:**
   ```bash
   javac -d . $(find src -name "*.java")
   ```

3. **Ejecutar:**
   ```bash
   java com.darkwhiskers.poker.Main
   ```

---

| Realizado por **Miguel Silva C.** \
| GitHub: [github.com/darkwhiskers] *( https://github.com/darkwhiskers )* \
| Licencia: © darkwhiskers.org — *Attribution-NonCommercial-NoDerivatives 4.0 International (CC BY-NC-ND 4.0)*

