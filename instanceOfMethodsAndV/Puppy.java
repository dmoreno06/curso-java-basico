/**
 * Puppy
 */
public class Puppy {

    int edad;

    public Puppy(String nombre) {
        System.out.println("el nombre es  :" + nombre);
    }

    // metodo set
    public void setEdad(int ed) {
        edad = ed;
    }

    // metodo get
    public int getEdad() {
        System.out.println("la edad es: " + edad);
        return edad;
    }

    // metodo principal
    public static void main(String[] args) {
        // creacion de un objeto de la clase
        Puppy perro = new Puppy("pulgas");
        // creacion de un objeto de la clase
        perro.setEdad(3);
        // creacion de un objeto de la clase
        perro.getEdad();
        // creacion de un objeto de la clase
        System.out.println("el valor de la variable es : " + perro.edad);
    }
}