package dev.herick.ilhajava;

import dev.herick.ilhajava.dominio.Percurso;
import dev.herick.ilhajava.excecoes.RotaInexistenteException;
import dev.herick.ilhajava.utils.CLI;
import dev.herick.ilhajava.utils.CriterioPercurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ponto de entrada.
 */
public class Main {

    private CLI cli = new CLI();

    public static void main(String... args) throws IOException {
        new Main(args).iniciarInterface();
    }

    private Main(String... args) {
        System.out.println("Bem vindo ao utilitário da Ilha de Java!");
    }

    private void iniciarInterface() throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String rawInput = consoleReader.readLine();
            Pattern pattern = Pattern.compile("(([A-Z][A-Z]\\d),\\s)*([A-Z][A-Z]\\d)");
            Matcher matcher = pattern.matcher(rawInput);
            if (!matcher.matches()) {
                System.out.println("Comando desconhecido. Informe o grafo de entrada na sintaxe definida. Ex.:");
                System.out.println("BC4, AD5, DC8, CD8, DE6, CE2, AE7, EB3, AB5");
                break;
            }

            String[] rotas = tratarEntrada(rawInput);
            for (int i = 0, tam = rotas.length; i < tam; i++) {
                String inicio = rotas[i].substring(0, 1);
                String fim = rotas[i].substring(1, 2);
                int distancia = Integer.parseInt(rotas[i].substring(2, 3));
                cli.adicionarRota(inicio, fim, distancia);
            }

            System.out.println(getDistanciaTratandoErro("A", "B", "C"));
            System.out.println(getDistanciaTratandoErro("A", "D"));
            System.out.println(getDistanciaTratandoErro("A", "D", "C"));
            System.out.println(getDistanciaTratandoErro("A", "E", "B", "C", "D"));
            System.out.println(getDistanciaTratandoErro("A", "E", "D"));

            CriterioPercurso criterio = CriterioPercurso.inicio("C").fim("C").maximoParadas(3);
            System.out.println(cli.getNumeroDePercursos(criterio));

            criterio = CriterioPercurso.inicio("A").fim("C").paradasExatas(4);
            System.out.println(cli.getNumeroDePercursos(criterio));

            System.out.println(cli.getDistanciaMaisCurta("A", "C"));
            System.out.println(cli.getDistanciaMaisCurta("B", "B"));

            criterio = CriterioPercurso.inicio("C").fim("C").distanciaMenorQue(30);
            System.out.println(cli.getNumeroDePercursos(criterio));

            System.out.println("------- FIM --------\n");
            System.out.println("Informe outro grafo, ou encerre o programa.\n");
        }
    }

    private String[] tratarEntrada(String rawInput) {
        return rawInput.trim().split(", ");
    }

    private String getDistanciaTratandoErro(String... paradas) {
        try {
            return String.valueOf(cli.getDistancia(Percurso.novo(paradas)));
        } catch (RotaInexistenteException ex) {
            return "ROTA NAO EXISTE";
        }
    }

}
