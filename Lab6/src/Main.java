public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Expansión: Nuevas Clases ===\n");

        // Personaje generico = new Personaje("Desconocido", 1, 100);
        System.out.println("-- Error esperado (línea comentada) --");
        System.out.println("// new Personaje(...) → cannot instantiate abstract class\n");

        Druida druida = new Druida("Sylva", 7, 200, 180, 120, 170);
        Nigromante nigromante = new Nigromante("Malachar", 6, 350, 220, 54);
        Bardo bardo = new Bardo("Finnian", 5, 150, 60, 35, "laúd");

        Personaje[] equipo = { druida, nigromante, bardo };

        System.out.println("-- Ataques y daño --");
        for (Personaje personaje : equipo) {
            personaje.atacar();
            System.out.println("Daño: " + personaje.calcularDanio());
        }

        System.out.println("\n-- Solo los Hechiceros lanzan hechizos --");
        for (Personaje personaje : equipo) {
            if (personaje instanceof Hechicero) {
                ((Hechicero) personaje).lanzarHechizo();
            }
        }

        System.out.println("\n-- Solo los Sanadores curan --");
        nigromante.recibirDanio(300);
        for (Personaje personaje : equipo) {
            if (personaje instanceof Sanador) {
                ((Sanador) personaje).curarAliado(nigromante);
            }
        }

        System.out.println("\n-- Estado final --");
        for (Personaje personaje : equipo) {
            System.out.println(personaje);
        }
    }
}
