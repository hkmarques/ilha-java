package dev.herick.ilhajava.utils;

import dev.herick.ilhajava.dominio.Percurso;
import dev.herick.ilhajava.dominio.Rota;
import dev.herick.ilhajava.excecoes.RotaInexistenteException;

import java.util.ArrayList;

/**
 * Classe contendo os métodos de interação com a CLI.
 */
public class CLI {

    private ArrayList<Rota> rotasPossiveis;

    public CLI() {
        this.rotasPossiveis = new ArrayList<>();
    }

    /**
     * Calcula e retorna a distância para o percurso informado.
     *
     * @param percurso  o percurso cuja distância será calculada
     * @return          a distância do percurso informado
     */
    public int getDistancia(Percurso percurso) {
        String[] paradas = percurso.getParadas();
        int distancia = 0;
        int nRotasPossiveis = this.rotasPossiveis.size();
        for (int iParadas = 0, tam = paradas.length - 1; iParadas < tam; iParadas++) {
            String paradaAtual = paradas[iParadas];
            String proximaParada = paradas[iParadas + 1];
            Rota rotaExistente = null;
            for (int iRotasPossiveis = 0; iRotasPossiveis < nRotasPossiveis; iRotasPossiveis++) {
                if (this.rotasPossiveis.get(iRotasPossiveis).getInicio().equals(paradaAtual)
                        && this.rotasPossiveis.get(iRotasPossiveis).getFim().equals(proximaParada)) {
                    rotaExistente = this.rotasPossiveis.get(iRotasPossiveis);
                    break;
                }
            }

            if (rotaExistente == null) {
                throw new RotaInexistenteException();
            }

            distancia += rotaExistente.getDistancia();
        }

        return distancia;
    }

    /**
     * Calcula e retorna o número de percursos existentes para o critério informado.
     *
     * @param criterio  o critério a ser usado na busca de percursos
     * @return          o número de percursos encontrados para o critério informado
     */
    public int getNumeroDePercursos(CriterioPercurso criterio) {
        return 0;
    }

    /**
     * Calcula a distância do percurso mais curto entre os pontos informados.
     *
     * @param inicio    o ponto de início
     * @param fim       o último ponto de parada
     * @return          a distância do menor percurso encontrado
     */
    public int getDistanciaMaisCurta(String inicio, String fim) {
        return 0;
    }

    /**
     * Adiciona uma nova rota possível.
     *
     * @param inicio    a província de início da rota
     * @param fim       a província de término da rota
     * @param distancia a distância da nova rota
     */
    public void adicionarRota(String inicio, String fim, int distancia) {
        this.rotasPossiveis.add(Rota.nova(inicio, fim, distancia));
    }

}
