package dev.herick.ilhajava;

import dev.herick.ilhajava.dominio.Rota;
import dev.herick.ilhajava.utils.CriterioRota;

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
     * Calcula e retorna a distância para a rota informada.
     *
     * @param rota  a rota cuja distância será calculada
     * @return      a distância da rota informada
     */
    public int getDistancia(Rota rota) {
        return 0;
    }

    /**
     * Calcula e retorna o número de rotas existentes para o critério informado.
     *
     * @param criterio  o critério a ser usado na busca de rotas
     * @return          o número de rotas encontradas para o critério informado
     */
    public int getNumeroDeRotas(CriterioRota criterio) {
        return 0;
    }

    /**
     * Calcula a distância da rota mais curta entre os pontos informados.
     *
     * @param inicio    o ponto de início
     * @param fim       o último ponto de parada
     * @return          a distância da rota mais curta encontrada
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
