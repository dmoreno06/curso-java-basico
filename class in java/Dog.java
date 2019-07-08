/**
 * Dos
 */
public class Dog {
    // declaracion de variavles
    String raza;
    int edad;
    String color;

    void raza() {
    }

    void edad() {
    }

    void color() {
    }

    public static void main(String[] args) {
        Dog perro = new Dog();

        // asignacion de valores.
        perro.color = "cafe";
        perro.edad = 3;
        perro.raza = "poodle";

        System.out.println(
                " Mi mascota es un " + perro.raza + " su color es " + perro.color + " y tiene " + perro.edad + " años");
    }
}

/**
 * InnerDog
 */
