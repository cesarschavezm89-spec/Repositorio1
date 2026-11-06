public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Sistema con Manejo de Excepciones ===\n");

        Druida druida = new Druida("Sylva", 7, 200, 180, 120, 170);
        Nigromante nigromante = new Nigromante("Malachar", 6, 350, 220, 54);
        MotorCombate motor = new MotorCombate();

        motor.ejecutarTurno(druida, nigromante);

        try {
            druida.recibirDanio(9999);
        } catch (AccionInvalidaException e) {
            System.out.println("Error en daño: " + e.getMessage());
        }
        motor.ejecutarTurno(druida, nigromante);

        Arquero sinFlechas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        motor.ejecutarTurno(sinFlechas, nigromante);

        System.out.println("\n-- Intento de curar aliado derrotado --");
        Druida druida2 = new Druida("Iris", 5, 180, 120, 90, 100);
        Druida personajeDerrotado = new Druida("Grom", 2, 0, 50, 50, 20);

        try {
            druida2.curarAliado(personajeDerrotado);
        } catch (RpgException e) {
            System.out.println("No se pudo curar: " + e.getMessage());
        }

        System.out.println("\n-- Bloque manual try-catch-finally --");
        try {
            nigromante.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        System.out.println("\n-- Bitácora completa --");
        motor.mostrarBitacora();
    }
}
