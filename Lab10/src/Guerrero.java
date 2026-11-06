public class Guerrero extends Personaje {
    private String arma;
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, String arma, int fuerza) {
        super(nombre, nivel, puntosVida);
        this.arma = arma;
        this.fuerza = fuerza;
    }

    public String getArma() {
        return arma;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public void atacar() throws RpgException {
        if (!isEstaVivo()) {
            throw new PersonajeDerrotadoException(getNombre());
        }

        System.out.println("[" + getNombre() + "] levanta " + arma + " y lanza un golpe demoledor.");
    }

    @Override
    public int calcularDanio() {
        return nivel * 18 + fuerza;
    }
}
