private String nombre;
private String especialidad;
private String correoElectronico;
private int aniosExperiencia;

public Catedraticos(String nombre, String especialidad, String correoElectronico, int aniosExperiencia) {
    this.nombre = nombre;
    this.especialidad = especialidad;
    this.correoElectronico = correoElectronico;
    this.aniosExperiencia = aniosExperiencia;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
}

public String getCorreoElectronico() {
    return correoElectronico;
}

public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
}

public int getAniosExperiencia() {
    return aniosExperiencia;
}

public void setAniosExperiencia(int aniosExperiencia) {
    this.aniosExperiencia = aniosExperiencia;
}

@Override
public String toString() {
    return "Catedraticos" +
            "\nnombre='" + nombre +
            "\nespecialidad='" + especialidad  +
            "\ncorreoElectronico='" + correoElectronico  +
            "\naniosExperiencia=" + aniosExperiencia ;
}

public static List<Catedraticos> crearCatedraticosEjemplo() {
    List<Catedraticos> catedraticos = new ArrayList<>();
    return catedraticos;
}

public static void mostrarCatedraticos (List < Catedraticos > catedraticos) {
    if (catedraticos.isEmpty()) {
        System.out.println("No hay catedráticos disponibles.");
    } else {
        System.out.println("\n--- Lista de Catedráticos ---");
        for (Catedraticos catedratico : catedraticos) {
            System.out.println(catedratico);
        }

    }
}

public static void agregarCatedratico(List<Catedraticos> catedraticos, Scanner scanner) {
    System.out.println("\n--- Agregar Catedrático ---");
    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Especialidad: ");
    String especialidad = scanner.nextLine();
    System.out.print("Correo: ");
    String correo = scanner.nextLine();
    System.out.print("Años de Experiencia: ");
    int experiencia = scanner.nextInt();
    scanner.nextLine(); // Consumir salto
    catedraticos.add(new Catedraticos(nombre, especialidad, correo, experiencia));
    System.out.println("Catedrático agregado exitosamente.");
}