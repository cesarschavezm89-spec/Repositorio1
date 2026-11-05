# Laboratorio 05 — Polimorfismo en Java

Este proyecto demuestra herencia y despacho dinámico con `Personaje`, `Guerrero`,
`Mago` y `Arquero`, además de sobrecarga de métodos, `instanceof` y un historial
de batalla administrado por `GestorBatalla`.

## Ejecutar

Desde la carpeta del proyecto, compila y ejecuta:

```powershell
javac -encoding UTF-8 -d bin src\*.java
java -cp bin App
```

La demostración está en `src\App.java`. Las clases no usan declaraciones de
paquete, de modo que se pueden compilar juntas con el comando anterior.
