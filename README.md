```markdown
# TutorialMod — Mod de Minecraft

**TutorialMod** es un mod creado como práctica del módulo de **Entornos de Desarrollo** en el ciclo de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.  
Su objetivo es aprender a trabajar con proyectos en Java y el entorno de **Minecraft Forge**.

---

## Descripción del Mod

El mod añade varios elementos nuevos al juego, centrados en la temática de la comida y la fantasía:

- **Durum y Kebab**: nuevos alimentos que el jugador puede comer para recuperar salud.  
- **Aldeano Cocinero de Kebab**: un nuevo tipo de aldeano que cocina y comercia con los nuevos alimentos.  
- **Bloque Cocina de Kebab**: un bloque especial que sirve como estación de trabajo para el cocinero.  
- **Anillos mágicos**: objetos que, al llevarlos en la mano secundaria, otorgan diferentes efectos como velocidad o fuerza.

El objetivo es mostrar cómo se pueden crear **nuevos ítems, bloques, entidades y efectos** dentro del juego.

---

## Organización del Proyecto

El mod está dividido en carpetas según el tipo de contenido:

```

src/main/java/net/kaupenjoe/tutorialmod/
├── TutorialMod.java        # Clase principal del mod
├── item/                   # Ítems como los kebabs, durums y anillos
├── block/                  # Bloques como la cocina de kebab
├── entity/                 # Entidades como el aldeano cocinero
└── datagen/                # Archivos para generar modelos y recetas automáticamente

```

Los recursos (texturas, modelos y recetas) están en:

```

src/main/resources/assets/tutorialmod/
├── models/     # Modelos de ítems y bloques
├── textures/   # Imágenes y texturas
└── recipes/    # Recetas de crafteo

```

---

## Cómo se ejecuta

1. Se abre el proyecto en **IntelliJ IDEA** o cualquier entorno compatible.  
2. Se ejecuta la tarea **runClient** para iniciar Minecraft con el mod cargado.  
3. De forma opcional, se puede usar **runData** para generar los archivos JSON de recetas y modelos.

---

## Conclusión

Este mod es un ejemplo sencillo que demuestra cómo:
- Crear y registrar nuevos elementos en Minecraft.  
- Organizar el código en paquetes según su función.  
- Usar herramientas del entorno de desarrollo para automatizar tareas.

El resultado es un pequeño mod divertido y bien estructurado que añade **comida, personajes y objetos mágicos** al mundo de Minecraft.

---

**Autores:** Jorge Muñoz y Cayetano Nicolás  
**Ciclo:** 1º DAM  
**Asignatura:** Entornos de Desarrollo  
**Versión de Minecraft:** 1.20.1  
**Versión de Forge:** 47.0.19
```
