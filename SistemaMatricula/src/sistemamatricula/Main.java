public class Main {
    public static void main(String[] args) {
        // Crear el gestor de docentes
        GestorDocentes gestor = new GestorDocentes();

        // Crear algunos docentes
        Docente docente1 = new Docente("Juan Pérez", "D001", "Matemáticas");
        Docente docente2 = new Docente("Ana López", "D002", "Historia");
        Docente docente3 = new Docente("Luis García", "D003", "Física");

        // Agregar los docentes al gestor
        gestor.agregarDocente(docente1);
        gestor.agregarDocente(docente2);
        gestor.agregarDocente(docente3);

        // Listar los docentes registrados
        System.out.println("Docentes registrados:");
        gestor.listarDocentes();

        // Obtener un docente por su código
        System.out.println("\nBuscando docente con código D002:");
        Docente docenteEncontrado = gestor.obtenerDocente("D002");
        if (docenteEncontrado != null) {
            System.out.println(docenteEncontrado);
        } else {
            System.out.println("Docente no encontrado.");
        }

        // Eliminar un docente por su código
        System.out.println("\nEliminando docente con código D001...");
        if (gestor.eliminarDocente("D001")) {
            System.out.println("Docente eliminado.");
        } else {
            System.out.println("Docente no encontrado.");
        }

        // Listar los docentes restantes
        System.out.println("\nDocentes restantes:");
        gestor.listarDocentes();
    }
}
