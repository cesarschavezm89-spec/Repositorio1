public class Nigromante extends Personaje implements Hechicero {
    private int mana;
    private int almasAbsorbidas;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana,
            int almasAbsorbidas) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.almasAbsorbidas = almasAbsorbidas;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " drena la esencia vital.");
    }

    @Override
    public int calcularDanio() {
        return nivel * 20 + almasAbsorbidas * 5;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza: ¡Maldición de decadencia! (maná: "
                + mana + ")");
    }

    @Override
    public int getMana() {
        return mana;
    }
}
