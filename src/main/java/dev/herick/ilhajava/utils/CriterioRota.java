package dev.herick.ilhajava.utils;

/**
 * Representa um critério de busca para rotas.
 */
public class CriterioRota {

    /**
     * Construtor privado, critério deve ser instanciado usando o método de início.
     */
    private CriterioRota() {
    }

    /**
     * Instancia um critério, definindo seu ponto de início.
     *
     * @param provincia a província na qual a rota tem início
     * @return          a nova instância de critério
     */
    public static CriterioRota inicio(String provincia) {
        CriterioRota criterio = new CriterioRota();
        return criterio;
    }

    /**
     * Define o ponto de término da rota.
     *
     * @param provincia a província na qual a rota termina
     * @return          este critério
     */
    public CriterioRota fim(String provincia) {
        return this;
    }

    /**
     * Define o número máximo de paradas das rotas.
     *
     * @param maximo    o número máximo de paradas
     * @return          este critério
     */
    public CriterioRota maximoParadas(int maximo) {
        return this;
    }

    /**
     * Define o número exato de paradas das rotas
     *
     * @param paradasExatas o número exato de paradas
     * @return              este critério
     */
    public CriterioRota paradasExatas(int paradasExatas) {
        return this;
    }

    /**
     * Define o limite superior para a distância das rotas
     *
     * @param limiteSuperior    o limite superior da distância das rotas
     * @return                  este critério
     */
    public CriterioRota distanciaMenorQue(int limiteSuperior) {
        return null;
    }

}
