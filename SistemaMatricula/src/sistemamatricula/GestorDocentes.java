import java.util.ArrayList;
import java.util.List;

public class GestorDocentes {
    private List<Docente> docentes;

    // Constructor
    public GestorDocentes() {
        this.docentes = new ArrayList<>();
    }

    // Método para agregar un docente
    public void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    // Método para eliminar un docente por su código
    public boolean eliminarDocente(String codigo) {
        for (Docente docente : docentes) {
            if (docente.getCodigo().equals(codigo)) {
                docentes.remove(docente);
                return true;
            }
        }
        return false;
    }

    // Método para obtener un docente por su código
    public Docente obtenerDocente(String codigo) {
        for (Docente docente : docentes) {
            if (docente.getCodigo().equals(codigo)) {
                return docente;
            }
        }
        return null;
    }

    // Método para listar todos los docentes
    public void listarDocentes() {
        if (docentes.isEmpty()) {
            System.out.println("No hay docentes registrados.");
        } else {
            for (Docente docente : docentes) {
                System.out.println(docente);
            }
        }
    }
}
