public class Main {
    public static void main(String[] args) {
        // Crear un objeto de cada clase.
        Perro perro = new Perro("Max", 3, 12.5, "Labrador", true);
        Gato gato = new Gato("Misi", 2, 3.8, "Gris", true);
        Canario canario = new Canario("Pico", 1, 0.03, "Amarillo", true);

        System.out.println("=== Clínica Veterinaria ===");

        System.out.println("\n-- Perro --");
        System.out.println(perro.toString());
        perro.comer();          // Método heredado de Animal.
        perro.ladrar();         // Método propio de Perro.
        perro.buscarPelota();   // Método propio de Perro.

        System.out.println("\n-- Gato --");
        System.out.println(gato.toString());
        gato.dormir();          // Método heredado de Animal.
        gato.maullar();         // Método propio de Gato.
        gato.ronronear();       // Método propio de Gato.

        System.out.println("\n-- Canario --");
        System.out.println(canario.toString());
        canario.comer();        // Método heredado de Animal.
        canario.cantar();       // Método propio de Canario.
        canario.volar();        // Método propio de Canario.
    }
}

/*
PREGUNTAS DE REFLEXIÓN

1. ¿Por qué declaramos los atributos como private y no como public?
   Porque private protege los datos y evita que otras clases los modifiquen
   directamente. Así se mantiene un mejor control sobre la información.

2. ¿Qué pasaría si quitaras el super() del constructor de Perro?
   Java intentaría llamar automáticamente al constructor vacío de Animal.
   Como Animal no tiene un constructor vacío, se produciría un error de
   compilación. super() permite inicializar los atributos heredados.

3. ¿Qué ventaja tiene sobreescribir toString() en lugar de crear un método
   con otro nombre?
   Al sobrescribir toString(), podemos mostrar la información del objeto
   directamente con System.out.println(objeto), sin tener que llamar a
   otro método. También se conserva el comportamiento esperado de Java.
*/
