public class Druida extends Personaje implements Hechicero, Sanador {
    private int mana;
    private int poderCuracion;
    private int vinculoNaturaleza;

    public Druida(String nombre, int nivel, int puntosVida, int mana,
            int poderCuracion, int vinculoNaturaleza) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.poderCuracion = poderCuracion;
        this.vinculoNaturaleza = vinculoNaturaleza;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " invoca raíces del bosque.");
    }

    @Override
    public int calcularDanio() {
        return nivel * 10 + vinculoNaturaleza;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza: ¡Tormenta de espinas! (maná: "
                + mana + ")");
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void curarAliado(Personaje aliado) {
        if (aliado == null) {
            throw new IllegalArgumentException("El aliado no puede ser null.");
        }
        aliado.puntosVida += poderCuracion;
        aliado.estaVivo = aliado.puntosVida > 0;
        System.out.println(nombre + " toca la tierra y cura a "
                + aliado.getNombre() + " +" + poderCuracion
                + ". Vida: " + aliado.getPuntosVida());
    }

    @Override
    public int getPoderCuracion() {
        return poderCuracion;
    }
}
