package dev.herick.ilhajava.dominio;

/**
 * Representa um percurso.
 * O percurso consiste de um conjunto de paradas a serem percorridas, desde que haja rota entre estas.
 */
public class Percurso {

    private String[] paradas;

    /**
     * Instancia um percurso com as paradas informadas.
     *
     * @param paradas   as paradas contidas no percurso, em ordem direta
     * @return          o percurso instanciado, contendo as paradas informadas
     */
    public static Percurso novo(String... paradas) {
        Percurso percurso = new Percurso();
        percurso.paradas = paradas;
        return percurso;
    }

    // region # Getters e setters

    public String[] getParadas() {
        return paradas;
    }

    // endregion

}
