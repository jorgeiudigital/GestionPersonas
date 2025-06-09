import Model.Persona;
import Services.ServicePersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ServicePersona personaService = new ServicePersona();

        // Ingreso de datos
        System.out.println("Ingrese la cantidad de personas:");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido:");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese la edad:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            System.out.println("Ingrese el género (M/F):");
            String genero = scanner.nextLine();
            System.out.println("Ingrese el sueldo por hora:");
            double sueldoHora = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            System.out.println("Ingrese el cargo:");
            String cargo = scanner.nextLine();

            personas.add(new Persona(nombre, apellido, edad, genero, sueldoHora, cargo));
        }

        // Operaciones con la clase de servicio
        System.out.println("Cantidad de personas almacenadas: " + personaService.contarPersonas(personas));
        System.out.println("Promedio de edades: " + personaService.calcularPromedioEdades(personas));
        System.out.println("Cantidad de personas mayores de edad: " + personaService.contarMayoresDeEdad(personas));

        System.out.println("Personas cuyos nombres empiezan con 'A':");
        personaService.filtrarPorNombreConA(personas).forEach(p -> System.out.println(p.getNombre()));

        System.out.println("Personas cuyos apellidos contienen la letra 'M':");
        personaService.filtrarPorApellidoConM(personas).forEach(p -> System.out.println(p.getApellido()));

        System.out.println("Sueldo por 8 horas de directores masculinos:");
        personaService.mostrarSueldoDirectoresMasculinos(personas);
    }

    }

