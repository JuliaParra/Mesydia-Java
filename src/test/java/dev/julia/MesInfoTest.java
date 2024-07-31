package dev.julia;



import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MesInfoTest {

    @Test
    public void testObtenerNombreDelMes() {
        assertEquals("Enero", MesInfo.obtenerNombreDelMes(1));
        assertEquals("Febrero", MesInfo.obtenerNombreDelMes(2));
        assertEquals("Marzo", MesInfo.obtenerNombreDelMes(3));
        assertEquals("Mes inválido", MesInfo.obtenerNombreDelMes(13));
    }

    @Test
    public void testObtenerDiasDelMes() {
        assertEquals(31, MesInfo.obtenerDiasDelMes(1));
        assertEquals(28, MesInfo.obtenerDiasDelMes(2));
        assertEquals(30, MesInfo.obtenerDiasDelMes(4));
        assertEquals(-1, MesInfo.obtenerDiasDelMes(13));
    }
}
