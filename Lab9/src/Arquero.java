public class Arquero extends Personaje {
    private final String arma;
    private final int flechas;
    private final int precision;

    public Arquero(String nombre, int nivel, int puntosVida, String arma,
                   int flechas, int precision) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.flechas = flechas;
        this.precision = precision;
    }

    public String getArma() {
        return arma;
    }

    public int getFlechas() {
        return flechas;
    }

    public int getPrecision() {
        return precision;
    }
}
