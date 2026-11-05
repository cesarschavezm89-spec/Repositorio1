public class Personaje {
    private final String nombre;
    private final int nivel;
    private int vida;

    public Personaje(String nombre, int nivel, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = Math.max(0, vida);
    }

    public void atacar() {
        System.out.println("[" + nombre + "] ataca con un golpe básico.");
    }

    public void defender() {
        System.out.println("[" + nombre + "] se prepara para defenderse.");
    }

    public int calcularDanio() {
        return nivel * 10;
    }

    public void recibirDanio(int danio) {
        if (danio < 0) {
            throw new IllegalArgumentException("El daño no puede ser negativo.");
        }

        vida = Math.max(0, vida - danio);
        System.out.println(nombre + " recibe " + danio
                + " puntos de daño. Vida restante: " + vida);
        if (vida == 0) {
            System.out.println(nombre + " ha sido derrotado.");
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " (nivel " + nivel + ")");
    }

    public void mostrarEstado(boolean detallado) {
        if (detallado) {
            System.out.println(toString());
        } else {
            mostrarEstado();
        }
    }

    public void mostrarEstado(String formato) {
        if (formato == null || formato.trim().isEmpty()) {
            throw new IllegalArgumentException("El formato no puede estar vacío.");
        }
        System.out.println(formato + ": " + toString());
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return nombre + " (nivel " + nivel + ", vida " + vida + ")";
    }
}
