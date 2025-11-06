```markdown
# TutorialMod — Mod de Minecraft con IntelliJ IDEA

Proyecto desarrollado en el entorno **IntelliJ IDEA** como parte del módulo de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.  
El objetivo es demostrar el uso de herramientas avanzadas del IDE y aplicar conceptos de **programación orientada a objetos, gestión de dependencias y generación automática de recursos** dentro de un entorno práctico: **modding en Minecraft con Forge**.

---

## Descripción del Mod

**KebabMod** es una extensión para Minecraft que introduce nuevos **minerales, herramientas y bloques** inspirados en un mundo de fantasía y metalurgia avanzada.  
Entre sus elementos principales destacan:

- **Alimentos especiales**, como el **Kebbab** y el **Durum**, que restauran la salud del jugador.

El mod también incluye **soporte para generación de datos automática** (data generation), lo que permite crear automáticamente modelos, texturas y recetas a partir del código Java.

---

## Tecnologías y Herramientas Utilizadas

- **Java 17**  
- **Minecraft Forge 1.20.1**  
- **Gradle 8.1.1**  
- **IntelliJ IDEA Ultimate** (entorno de desarrollo principal)

---

## Funciones destacadas del uso de IntelliJ IDEA

El proyecto se ha desarrollado aprovechando las principales capacidades del IDE:

### Gestión del Proyecto
- Configuración de **Gradle** para automatizar compilaciones, ejecución del cliente y tareas de generación (`runData`, `runClient`).
- Uso de **paquetes (packages)** para organizar el código (`block`, `item`, `datagen`, etc.).

### Productividad y depuración
- **Live Templates** y **code generation** para crear clases base y métodos rápidamente.  
- **Depurador integrado** para ejecutar el mod directamente en modo desarrollador.  
- **Análisis de código estático** y sugerencias automáticas de refactorización.

### Edición avanzada
- Integración con el sistema de recursos de Minecraft: autocompletado de rutas de texturas y modelos.  
- Previsualización y validación de archivos JSON dentro del IDE.  
- Uso de la **vista de Gradle** para ejecutar tareas de compilación y generación sin usar la terminal.

### Data Generation
- Implementación de generadores de datos como `ModBlockStateProvider` y `ModItemModelProvider`, que crean automáticamente:
  - Estados de bloque (`blockstates`)
  - Modelos de ítem y bloque (`models`)
  - Recetas de crafteo (`recipes`)

Esto evita tener que escribir manualmente los JSON de cada bloque o ítem.

---

## Estructura del Proyecto

```

src/main/java/net/kaupenjoe/tutorialmod/
├── TutorialMod.java                  # Clase principal del mod
├── block/ModBlocks.java              # Registro de nuevos bloques
├── item/ModItems.java                # Registro de ítems y herramientas
├── datagen/
│   ├── ModBlockStateProvider.java    # Generador de modelos y estados de bloque
│   ├── ModItemModelProvider.java     # Generador de modelos de ítems
│   └── ModRecipeProvider.java        # Generador de recetas de crafteo
└── world/                           # (Opcional) Generación de minerales o estructuras

```

Los recursos se encuentran en:

```

src/main/resources/assets/tutorialmod/
├── blockstates/                      # Estados de bloque
├── models/
│   ├── block/                        # Modelos de bloques
│   └── item/                         # Modelos de ítems
└── textures/
├── block/                        # Texturas de bloques
└── item/                         # Texturas de ítems

```

---

## Ejecución del Proyecto

1. Clonar el repositorio o importar el proyecto en **IntelliJ IDEA**.  
2. Abrir la **vista Gradle** y ejecutar:
```

runClient

```
para abrir Minecraft con el mod cargado.

3. Para generar los datos (modelos, recetas, etc.), ejecutar:
```

runData

````

4. Los archivos generados aparecerán en la carpeta `generated/resources/`.

---

## Funciones principales en código

Ejemplo de generación automática de un bloque con texturas diferenciadas:

```java
private void kebbabBlockWithItem(RegistryObject<Block> blockRegistryObject) {
 ModelFile kebbabModel = models().cubeBottomTop(
     blockRegistryObject.getId().getPath(),
     modLoc("block/kebbab_block_side"),
     modLoc("block/kebbab_block_bottom"),
     modLoc("block/kebbab_block_top")
 );

 simpleBlock(blockRegistryObject.get(), kebbabModel);
 itemModels().withExistingParent(
     blockRegistryObject.getId().getPath(),
     new ResourceLocation(TutorialMod.MOD_ID, "block/" + blockRegistryObject.getId().getPath())
 );
}
````

---

## Conclusión

Este proyecto demuestra:

* El uso práctico de **Java** y **Forge API**.
* La capacidad de **automatizar tareas** de desarrollo mediante **data generation**.
* El dominio de herramientas de desarrollo modernas como **IntelliJ IDEA**, aprovechando sus funciones avanzadas de refactorización, depuración, y análisis de código.

El resultado final es un mod funcional y bien estructurado, que combina **diseño visual**, **programación orientada a objetos** y **automatización profesional** dentro del ecosistema de Minecraft.

**Autor:** [Jorge Muñoz y Cayetano Nicolas]
**Ciclo:** 1º DAM
**Asignatura:** Entornos de desarrollo
**IDE:** IntelliJ IDEA Community
**Versión de Minecraft:** 1.20.1
**Versión de Forge:** 47.0.19
```
