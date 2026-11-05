public class Mago extends Personaje {
    private final int mana;
    private final String elemento;

    public Mago(String nombre, int nivel, int vida, int mana, String elemento) {
        super(nombre, nivel, vida);
        this.mana = mana;
        this.elemento = elemento;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡" + getNombre() + " lanza un hechizo de " + elemento
                + " causando " + mana + " de daño mágico!");
    }

    @Override
    public int calcularDanio() {
        return mana * getNivel();
    }
}
