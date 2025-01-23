package sistemamatricula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GestorDocentesTest {

    private GestorDocentes gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDocentes();
    }

    @Test
    void testAgregarDocente() {
        Docente docente = new Docente("Juan Pérez", "D001", "Matemáticas");
        gestor.agregarDocente(docente);
        assertNotNull(gestor.obtenerDocente("D001"));
    }

    @Test
    void testEliminarDocente() {
        Docente docente = new Docente("Ana López", "D002", "Historia");
        gestor.agregarDocente(docente);
        assertTrue(gestor.eliminarDocente("D002"));
    }

    @Test
    void testEliminarDocenteNoExistente() {
        assertFalse(gestor.eliminarDocente("D999"));
    }

    @Test
    void testObtenerDocente() {
        Docente docente = new Docente("Luis García", "D003", "Física");
        gestor.agregarDocente(docente);
        Docente docenteEncontrado = gestor.obtenerDocente("D003");
        assertNotNull(docenteEncontrado);
        assertEquals("Luis García", docenteEncontrado.getNombre());
    }

    @Test
    void testListarDocentes() {
        Docente docente1 = new Docente("Juan Pérez", "D001", "Matemáticas");
        Docente docente2 = new Docente("Ana López", "D002", "Historia");
        gestor.agregarDocente(docente1);
        gestor.agregarDocente(docente2);
        assertEquals(2, gestor.getDocentes().size());
    }
}
