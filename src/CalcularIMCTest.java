import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;


class CalcularIMCTest {

    @Test
    public void deveTestarMasculinoAbaixoPeso() {
        CalcularIMC pessoa = new CalcularIMC(20.6f, 1.0f, "homem");
        assertEquals("abaixo do peso", CalcularIMC.classificarIMCTest(pessoa));
    }

    @Test
    public void deveTestarMasculinoPesoNormal() {
        CalcularIMC pessoa = new CalcularIMC(26.3f, 1.0f, "homem");
        assertEquals("no peso normal", CalcularIMC.classificarIMCTest(pessoa));
    }

    @Test
    public void deveTestarMasculinoAbaixoPesoMock() {
        ICalcularIMC pessoaMock = createMock(ICalcularIMC.class);
        expect(pessoaMock.calculaIMC()).andReturn(20.6f);
        expect(pessoaMock.getSexo()).andReturn("homem");
        replay(pessoaMock);
        assertEquals("abaixo do peso", CalcularIMC.classificarIMCTest(pessoaMock));
    }

    @Test
    public void deveTestarMasculinoPesoNormalMock() {
        ICalcularIMC pessoaMock = createMock(ICalcularIMC.class);
        expect(pessoaMock.calculaIMC()).andReturn(26.3f);
        expect(pessoaMock.getSexo()).andReturn("homem");
        replay(pessoaMock);
        assertEquals("no peso normal", CalcularIMC.classificarIMCTest(pessoaMock));
    }

}