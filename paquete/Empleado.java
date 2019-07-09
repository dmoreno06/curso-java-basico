import java.io.*;

/**
 * Empleado
 */
public class Empleado {

    String nombre;
    int edad;
    String areaEmpleo;
    double salario;

    // constructor de la clase Empleado
    public Empleado(String nom) {
        this.nombre = nom;
    }

    // asignnacion de la variable edad
    public void empleadoEdad(int empleadoEdad) {
        edad = empleadoEdad;
    }

    //
    public void empleadoAreadeEmpleo(String empleadoAreadeEmpleo) {
        areaEmpleo = empleadoAreadeEmpleo;
    }

    //
    public void empleadoSalario(double empleadoSalario) {
        salario = empleadoSalario;
    }

    // mostrar el detalle de el empleado
    public void mostrarEmpleado() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Area de desarrollo :" + areaEmpleo);
        System.out.println("Salario:" + salario + "\n");
    }
}