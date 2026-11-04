public class Animal {
    // Atributos privados para proteger la información del animal.
    private String nombre;
    private int edad;
    private double peso;

    // Constructor de la clase base.
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Getter para que las clases hijas puedan utilizar el nombre.
    public String getNombre() {
        return nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | Edad: " + edad + " años"
                + " | Peso: " + peso + " kg";
    }
}
