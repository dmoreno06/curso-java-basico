/**
 * Puppy
 */
public class Puppy {

    public Puppy() {

    }

    public Puppy(String nombre) {
        // este constructor recibe un parameto 'nombre'
        System.out.println("el nombre es " + nombre);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Laura");
    }
}