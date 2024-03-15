/*
 * Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre.
 */
package javaejercico22;

import java.util.Scanner;

public class JavaEjercico22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double salarioPorHora, horasTrabajadas, salarioMensual;

        // Entrada de datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el valor del salario básico por hora: ");
        salarioPorHora = scanner.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas en un mes: ");
        horasTrabajadas = scanner.nextDouble();

        // Proceso
        salarioMensual = salarioPorHora * horasTrabajadas;

        // proceso aplicando el condicional
        if (salarioMensual > 450000) {
            System.out.println("El nombre del empleado es: " + nombre);
            System.out.println("El salario mensual es: $" + salarioMensual);
        } else {
            System.out.println("El nombre del empleado es: " + nombre);
        }
    }
    
}
