public class Druida extends Personaje {
    private int mana;
    private int poderCuracion;
    private int vinculoNaturaleza;

    public Druida(String nombre, int nivel, int puntosVida, int mana) {
        this(nombre, nivel, puntosVida, mana, 30, 15);
    }

    public Druida(String nombre, int nivel, int puntosVida, int mana, int poderCuracion, int vinculoNaturaleza) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.poderCuracion = poderCuracion;
        this.vinculoNaturaleza = vinculoNaturaleza;
    }

    public int getMana() {
        return mana;
    }

    public int getPoderCuracion() {
        return poderCuracion;
    }

    @Override
    public void atacar() throws RpgException {
        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }

        if (mana < 10) {
            throw new RecursoInsuficienteException("mana", mana);
        }

        mana -= 10;
        System.out.println("[" + getNombre() + "] invoca raices del bosque y ataca con furia natural.");
    }

    @Override
    public int calcularDanio() {
        return nivel * 20 + vinculoNaturaleza;
    }

    public void curarAliado(Personaje aliado) throws RpgException {
        if (aliado == null) {
            throw new PersonajeNuloException("curarAliado");
        }

        if (!aliado.isEstaVivo()) {
            throw new AccionInvalidaException(
                "curarAliado",
                "No se puede curar a un personaje derrotado"
            );
        }

        aliado.puntosVida += poderCuracion;
        aliado.estaVivo = aliado.puntosVida > 0;
        System.out.println(getNombre() + " toca la tierra y cura a " + aliado.getNombre() + " +" + poderCuracion + ". Vida: " + aliado.getPuntosVida());
    }
}
