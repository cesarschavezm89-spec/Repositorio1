public class Bardo extends Personaje implements Sanador {
    private int poderCuracion;
    private int carisma;
    private String instrumento;

    public Bardo(String nombre, int nivel, int puntosVida, int poderCuracion,
            int carisma, String instrumento) {
        super(nombre, nivel, puntosVida);
        this.poderCuracion = poderCuracion;
        this.carisma = carisma;
        this.instrumento = instrumento;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " aturde con su " + instrumento + ".");
    }

    @Override
    public int calcularDanio() {
        return nivel * 10 + carisma;
    }

    @Override
    public void curarAliado(Personaje aliado) {
        if (aliado == null) {
            throw new IllegalArgumentException("El aliado no puede ser null.");
        }
        aliado.puntosVida += poderCuracion;
        aliado.estaVivo = aliado.puntosVida > 0;
        System.out.println(nombre + " entona una melodía y cura a "
                + aliado.getNombre() + " +" + poderCuracion
                + ". Vida: " + aliado.getPuntosVida());
    }

    @Override
    public int getPoderCuracion() {
        return poderCuracion;
    }
}
