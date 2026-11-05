package lab4;

public class Mago extends Personaje {
    private final int mana;
    private final String escuelaMagia;

    public Mago(String nombre, int nivel, int puntosVida, int mana, String escuelaMagia) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.escuelaMagia = escuelaMagia;
    }

    public int getMana() {
        return mana;
    }

    public String getEscuelaMagia() {
        return escuelaMagia;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un hechizo de " + escuelaMagia + ".");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se protege con un escudo mágico.");
    }

    @Override
    public String toString() {
        return "Mago{"
                + "personaje=" + super.toString()
                + ", mana=" + mana
                + ", escuelaMagia='" + escuelaMagia + '\''
                + '}';
    }
}
