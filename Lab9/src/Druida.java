public class Druida extends Personaje {
    private final int mana;

    public Druida(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }
}
