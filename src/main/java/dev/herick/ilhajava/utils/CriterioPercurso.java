package dev.herick.ilhajava.utils;

/**
 * Representa um critério de busca paro percursos.
 */
public class CriterioPercurso {

    /**
     * Construtor privado, critério deve ser instanciado usando o método de início.
     */
    private CriterioPercurso() {
    }

    /**
     * Instancia um critério, definindo seu ponto de início.
     *
     * @param provincia a província na qual o percurso tem início
     * @return          a nova instância de critério
     */
    public static CriterioPercurso inicio(String provincia) {
        CriterioPercurso criterio = new CriterioPercurso();
        return criterio;
    }

    /**
     * Define o ponto de término do percurso.
     *
     * @param provincia a província na qual o percurso termina
     * @return          este critério
     */
    public CriterioPercurso fim(String provincia) {
        return this;
    }

    /**
     * Define o número máximo de paradas dos percursos.
     *
     * @param maximo    o número máximo de paradas
     * @return          este critério
     */
    public CriterioPercurso maximoParadas(int maximo) {
        return this;
    }

    /**
     * Define o número exato de paradas dos percursos
     *
     * @param paradasExatas o número exato de paradas
     * @return              este critério
     */
    public CriterioPercurso paradasExatas(int paradasExatas) {
        return this;
    }

    /**
     * Define o limite superior para a distância dos percursos
     *
     * @param limiteSuperior    o limite superior da distância dos percursos
     * @return                  este critério
     */
    public CriterioPercurso distanciaMenorQue(int limiteSuperior) {
        return null;
    }

}
