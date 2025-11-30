import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalisaIMCTest {

    @Test
    public void testClassificarIMCHomemPesoNormal() {
        Pessoa pessoa = new Pessoa("homem", 1.80f, 80f);
        String resultado = AnalisaIMC.classificarIMC(pessoa);
        assertEquals("Peso normal", resultado);
    }

    @Test
    public void testClassificarIMCMulherAbaixoPeso() {
        Pessoa pessoa = new Pessoa("mulher", 1.70f, 48f);
        String resultado = AnalisaIMC.classificarIMC(pessoa);
        assertEquals("Abaixo do peso", resultado);
    }
}
