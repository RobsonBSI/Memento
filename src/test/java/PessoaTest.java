import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void deveArmazenarStatus() {
        Pessoa pessoa = new Pessoa();
        pessoa.setStatus(StutusCasado.getInstance());
        pessoa.setStatus(StutusSolteiro.getInstance());
        assertEquals(2, pessoa.getStatusRelacionamento().size());
    }
    @Test
    void deveRetornarStatusInicial() {
        Pessoa pessoa = new Pessoa();
        pessoa.setStatus(StutusCasado.getInstance());
        pessoa.setStatus(StutusSolteiro.getInstance());
        pessoa.restauraStatus(0);
        assertEquals(StutusCasado.getInstance(), pessoa.getStatus());
    }
    @Test
    void deveRetornarEstadoAnterior() {
        Pessoa pessoa = new Pessoa();
        pessoa.setStatus(StutusCasado.getInstance());
        pessoa.setStatus(StutusDivorciado.getInstance());
        pessoa.setStatus(StutusNamorando.getInstance());
        pessoa.setStatus(StutusViuvo.getInstance());
        pessoa.setStatus(StutusNamorando.getInstance());
        pessoa.setStatus(StutusCasado.getInstance());

        pessoa.restauraStatus(2);
        assertEquals(StutusNamorando.getInstance(), pessoa.getStatus());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.restauraStatus(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}