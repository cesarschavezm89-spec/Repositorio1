public class Arquero extends Personaje {
    private final String arma;
    private int flechasDisponibles;
    private final int precision;

    public Arquero(String nombre, int nivel, int vida, String arma,
            int flechasDisponibles, int precision) {
        super(nombre, nivel, vida);
        this.arma = arma;
        this.flechasDisponibles = Math.max(0, flechasDisponibles);
        this.precision = precision;
    }

    @Override
    public void atacar() {
        super.atacar();
        if (flechasDisponibles == 0) {
            System.out.println(getNombre() + " no tiene flechas disponibles.");
            return;
        }

        flechasDisponibles--;
        System.out.println(getNombre() + " dispara una flecha con " + arma
                + ". Flechas restantes: " + flechasDisponibles);
    }

    @Override
    public int calcularDanio() {
        return precision * flechasDisponibles;
    }

    public int getFlechasDisponibles() {
        return flechasDisponibles;
    }
}
