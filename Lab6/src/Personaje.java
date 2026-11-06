public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected boolean estaVivo;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.estaVivo = puntosVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void recibirDanio(int danio) {
        if (danio < 0) {
            throw new IllegalArgumentException("El daño no puede ser negativo.");
        }

        puntosVida = Math.max(0, puntosVida - danio);
        estaVivo = puntosVida > 0;
        System.out.println(nombre + " recibe " + danio
                + " de daño. Vida: " + puntosVida);
        if (!estaVivo) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public abstract void atacar();

    public abstract int calcularDanio();

    @Override
    public String toString() {
        String vivo = estaVivo ? "Sí" : "No";
        return "Nombre: " + nombre + " | Nivel: " + nivel
                + " | Vida: " + puntosVida + " | Vivo: " + vivo;
    }
}
