import java.util.ArrayList;
import java.util.List;

public class GestorBatalla {
    private final List<String> historial = new ArrayList<String>();

    public void ejecutarAtaque(Personaje atacante) {
        validarPersonaje(atacante, "atacante");
        int danio = atacante.calcularDanio();
        atacante.atacar();
        String evento = atacante.getNombre() + " atacó solo (daño: " + danio + ")";
        historial.add(evento);
        System.out.println("[BATALLA] " + atacante.getNombre()
                + " ataca solo → daño: " + danio);
    }

    public void ejecutarAtaque(Personaje atacante, Personaje defensor) {
        validarPersonaje(atacante, "atacante");
        validarPersonaje(defensor, "defensor");
        int danio = atacante.calcularDanio();
        atacante.atacar();
        defensor.recibirDanio(danio);
        defensor.defender();

        String evento = atacante.getNombre() + " atacó a " + defensor.getNombre()
                + " (daño: " + danio + ")";
        if (defensor.getVida() == 0) {
            evento += " - " + defensor.getNombre() + " derrotado";
        }
        historial.add(evento);
        System.out.println("[BATALLA] " + atacante.getNombre() + " ataca a "
                + defensor.getNombre() + " → daño: " + danio);
    }

    public void ejecutarAtaque(Personaje[] equipo) {
        if (equipo == null) {
            throw new IllegalArgumentException("El equipo no puede ser null.");
        }

        StringBuilder nombres = new StringBuilder();
        int danioTotal = 0;
        for (Personaje personaje : equipo) {
            validarPersonaje(personaje, "integrante del equipo");
            danioTotal += personaje.calcularDanio();
            if (nombres.length() > 0) {
                nombres.append(", ");
            }
            nombres.append(personaje.getNombre());
            personaje.atacar();
        }

        historial.add("Ataque en equipo: " + nombres);
        System.out.println("[BATALLA] Equipo completo ataca → "
                + equipo.length + " personajes (daño combinado: " + danioTotal + ")");
    }

    public void mostrarHistorial() {
        System.out.println("-- Historial --");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }

    public void limpiarHistorial() {
        historial.clear();
    }

    private void validarPersonaje(Personaje personaje, String rol) {
        if (personaje == null) {
            throw new IllegalArgumentException("El " + rol + " no puede ser null.");
        }
    }
}
