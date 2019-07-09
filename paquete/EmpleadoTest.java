import java.io.*;

/**
 * EmpleadoTest
 */
public class EmpleadoTest {

    public static void main(String[] args) {
        // crear dos objetos usando el constructor.
        Empleado empleadoUno = new Empleado("Paola Mena");
        Empleado empleadoDos = new Empleado("Laura miro");
        // Invocar métodos para cada objeto creado

        empleadoUno.empleadoEdad(26);
        empleadoUno.empleadoAreadeEmpleo("QA");
        empleadoUno.empleadoSalario(6.000000);
        empleadoUno.mostrarEmpleado();

        empleadoDos.empleadoEdad(26);
        empleadoDos.empleadoAreadeEmpleo("Developer in JAVA");
        empleadoDos.empleadoSalario(3.500000);
        empleadoDos.mostrarEmpleado();

    }
}