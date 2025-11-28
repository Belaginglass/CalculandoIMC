import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;

class AnalisaIMCMockTest {

    @Test
    public void testClassificarIMCComMock() {

        PessoaInterface pessoaMock = createMock(PessoaInterface.class);
        expect(pessoaMock.getSexo()).andReturn("homem");
        expect(pessoaMock.getPeso()).andReturn(70f);
        expect(pessoaMock.getAltura()).andReturn(1.75f);
        replay(pessoaMock);
        String resultado = AnalisaIMC.classificarIMC(pessoaMock);
        assertEquals("Peso normal", resultado);

        verify(pessoaMock);
    }
}
