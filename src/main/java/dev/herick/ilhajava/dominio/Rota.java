package dev.herick.ilhajava.dominio;

/**
 * Representativa do conceito de Rota.
 */
public class Rota {

    private int distancia;
    private String inicio;
    private String fim;

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
        rota.distancia = distancia;
        rota.inicio = inicio;
        rota.fim = fim;
        return rota;
    }

    // region # Getters e setters

    public int getDistancia() {
        return distancia;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFim() {
        return fim;
    }

    // endregion

}
