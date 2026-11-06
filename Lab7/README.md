# Lab 7 — Manejo de excepciones en Java

Este proyecto implementa un sistema RPG con excepciones personalizadas para manejar personajes derrotados, recursos insuficientes, daños inválidos y personajes nulos.

## Estructura principal

- `src/Personaje.java`: clase base abstracta
- `src/Arquero.java`: validación de flechas y estado del personaje
- `src/Druida.java`: validación de mana y curación de aliados
- `src/Nigromante.java`: validación de mana al atacar
- `src/MotorCombate.java`: ejecución de turnos con try-catch-finally y bitácora
- `src/Main.java`: demostración de los escenarios del laboratorio

## Ejecutar

```bash
cd "C:\Users\cesar\OneDrive\Documentos\cESAR\Programacion en Java\Lab7"
javac src/*.java
java -cp src Main
```
