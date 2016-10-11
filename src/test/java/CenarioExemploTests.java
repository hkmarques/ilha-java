import dev.herick.ilhajava.CLI;
import dev.herick.ilhajava.dominio.Percurso;
import dev.herick.ilhajava.excecoes.RotaInexistenteException;
import dev.herick.ilhajava.utils.CriterioPercurso;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Testes unitários da CLI para os casos de exemplo inclusos na descrição
 * do exercício.
 */
public class CenarioExemploTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private CLI cli;

    @Before
    public void setUp() {
        cli = new CLI();
        cli.adicionarRota("B", "C", 4);
        cli.adicionarRota("A", "D", 5);
        cli.adicionarRota("D", "C", 8);
        cli.adicionarRota("C", "D", 8);
        cli.adicionarRota("D", "E", 6);
        cli.adicionarRota("C", "E", 2);
        cli.adicionarRota("A", "E", 7);
        cli.adicionarRota("E", "B", 3);
        cli.adicionarRota("A", "B", 5);
    }

    @Test
    public void distanciaABC() {
        int obtida = cli.getDistancia(Percurso.novo("A", "B", "C"));
        assertEquals(9, obtida);
    }

    @Test
    public void distanciaAD() {
        int obtida = cli.getDistancia(Percurso.novo("A", "D"));
        assertEquals(5, obtida);
    }

    @Test
    public void distanciaADC() {
        int obtida = cli.getDistancia(Percurso.novo("A", "D", "C"));
        assertEquals(13, obtida);
    }

    @Test
    public void distanciaAEBCD() {
        int obtida = cli.getDistancia(Percurso.novo("A", "E", "B", "C", "D"));
        assertEquals(22, obtida);
    }

    @Test
    public void distanciaAED() {
        thrown.expect(RotaInexistenteException.class);
        cli.getDistancia(Percurso.novo("A", "E", "D"));
    }

    @Test
    public void inicioFimCMax3Paradas() {
        CriterioPercurso criterio = CriterioPercurso.inicio("C").fim("C").maximoParadas(3);
        int obtidas = cli.getNumeroDePercursos(criterio);
        assertEquals(2, obtidas);
    }

    @Test
    public void inicioAFimC4Paradas() {
        CriterioPercurso criterio = CriterioPercurso.inicio("A").fim("C").paradasExatas(4);
        int obtidas = cli.getNumeroDePercursos(criterio);
        assertEquals(3, obtidas);
    }

    @Test
    public void distanciaMaisCurtaAC() {
        int obtida = cli.getDistanciaMaisCurta("A", "C");
        assertEquals(9, obtida);
    }

    @Test
    public void distanciaMaisCurtaBB() {
        int obtida = cli.getDistanciaMaisCurta("B", "B");
        assertEquals(9, obtida);
    }

    @Test
    public void numeroPercursosCCdistanciaMenorQue30() {
        CriterioPercurso criterio = CriterioPercurso.inicio("C").fim("C").distanciaMenorQue(30);
        int obtidas = cli.getNumeroDePercursos(criterio);
        assertEquals(7, obtidas);
    }
    
}
