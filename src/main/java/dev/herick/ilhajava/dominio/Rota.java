package dev.herick.ilhajava.dominio;

/**
 * Representativa do conceito de Rota.
 */
public class Rota {

    private String[] paradas;

    /**
     * Instancia uma rota com as paradas informadas.
     *
     * @param paradas   as paradas contidas na rota, em ordem direta
     * @return          a rota instanciada, contendo as paradas informadas
     */
    public static Rota nova(String... paradas) {
        Rota rota = new Rota();
        rota.paradas = paradas;
        return rota;
    }

}
