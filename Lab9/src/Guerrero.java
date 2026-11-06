public class Guerrero extends Personaje {
    private final String arma;
    private final int dano;

    public Guerrero(String nombre, int nivel, int puntosVida, String arma, int dano) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.dano = dano;
    }

    public String getArma() {
        return arma;
    }

    public int getDano() {
        return dano;
    }
}
