package dev.herick.ilhajava.dominio;

/**
 * Representativa do conceito de Rota.
 */
public class Rota {

    private String[] paradas;

    private int distancia;

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

    /**
     * Instancia uma rota entre as províncias informadas, definindo a distância.
     *
     * @param inicio    a província de início da rota
     * @param fim       a província de término da rota
     * @param distancia a distância da rota
     * @return          a rota instanciada
     */
    public static Rota nova(String inicio, String fim, int distancia) {
        Rota rota = new Rota();
        rota.paradas  = new String[] {inicio, fim};
        rota.distancia = distancia;
        return rota;
    }

}
