public class Computador {
    String patrimonio;
    String modelo;
    String sistemaOperacional;
    boolean ligado;
    void ligar() { ligado = true; }
    void desligar() { ligado = false; }
    void exibirInformacoes() {
        System.out.println("Patrimônio: " + patrimonio);
        System.out.println("Modelo: " + modelo);
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Ligado: " + ligado);
    }
}
