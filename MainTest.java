package exTestUnitarios.src;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @ParameterizedTest
    @CsvSource({
            "00000000, T",
            "00000001, R",
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P",
            "00000009, D",
            "00000010, X",
            "00000011, B",
            "00000012, N",
            "00000013, J",
            "00000014, Z",
            "00000015, Q",
            "00000016, S",
            "00000017, V",
            "00000018, H",
            "00000019, L",
            "00000020, C",
            "00000021, K",
            "00000022, E"
    })
    void testComprobarDNI_TodasLetras(String dni, char letra) {
        assertTrue(Main.comprobarDNI(dni, letra));
    }

    @ParameterizedTest
    @CsvSource({
            "00000000, T",
            "00000001, R",
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P",
            "00000009, D",
            "00000010, X",
            "00000011, B",
            "00000012, N",
            "00000013, J",
            "00000014, Z",
            "00000015, Q",
            "00000016, S",
            "00000017, V",
            "00000018, H",
            "00000019, L",
            "00000020, C",
            "00000021, K",
            "00000022, E"
    })
    void testCalcularLetraDNI_TodasLetras(String dni, char letra) {
        assertEquals(letra, Main.calcularLetraDNI(dni));
    }

    // Test para comprobar el error cuando el DNI es demasiado corto
    @Test
    public void testCalcularLetraDNICorto() {
        Exception corto = assertThrows(IllegalArgumentException.class, () -> {
            Main.calcularLetraDNI("1234567");
        });
        assertEquals("El DNI debe tener como minimo 8 caracteres", corto.getMessage());
    }

    // Test para comprobar el error cuando el DNI es demasiado largo
    @Test
    public void testCalcularLetraDNILargo() {
        Exception largo = assertThrows(IllegalArgumentException.class, () -> {
            Main.calcularLetraDNI("123456789");
        });
        assertEquals("El DNI debe tener como minimo 8 caracteres", largo.getMessage());
    }
}
