package Services;

import java.util.List;
import java.util.stream.Collectors;
import Model.Persona;

public class ServicePersona {

    public long contarPersonas(List<Persona> personas) {
        return personas.size();
    }

    public double calcularPromedioEdades(List<Persona> personas) {
        return personas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
    }

    public long contarMayoresDeEdad(List<Persona> personas) {
        return personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .count();
    }

    public List<Persona> filtrarPorNombreConA(List<Persona> personas) {
        return personas.stream()
                .filter(p -> p.getNombre().startsWith("A"))
                .collect(Collectors.toList());
    }

    public List<Persona> filtrarPorApellidoConM(List<Persona> personas) {
        return personas.stream()
                .filter(p -> p.getApellido().contains("M"))
                .collect(Collectors.toList());
    }

    public void mostrarSueldoDirectoresMasculinos(List<Persona> personas) {
        personas.stream()
                .filter(p -> "Director".equalsIgnoreCase(p.getCargo()) && "M".equalsIgnoreCase(p.getGenero()))
                .map(p -> p.getSueldoHora() * 8)
                .forEach(sueldo -> System.out.println("Sueldo por 8 horas: $" + sueldo));
    }
}
