package lab4;

public class Arquero extends Personaje {
    private final String tipoArco;
    private final int flechasDisponibles;

    public Arquero(String nombre, int nivel, int puntosVida, String tipoArco, int flechasDisponibles) {
        super(nombre, nivel, puntosVida);
        this.tipoArco = tipoArco;
        this.flechasDisponibles = flechasDisponibles;
    }

    public String getTipoArco() {
        return tipoArco;
    }

    public int getFlechasDisponibles() {
        return flechasDisponibles;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " dispara una flecha a distancia con su arco de "
                + tipoArco + ".");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " esquiva el ataque y se repliega.");
    }

    @Override
    public String toString() {
        return "Arquero{"
                + "personaje=" + super.toString()
                + ", tipoArco='" + tipoArco + '\''
                + ", flechasDisponibles=" + flechasDisponibles
                + '}';
    }
}
