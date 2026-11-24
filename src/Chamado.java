public class Chamado {
    private int numero;
    private String descricao;
    private String status;
    private Computador computador;
    private Tecnico tecnico;
    private static int totalChamados = 0;
    public Chamado(int numero, String descricao, String status, Computador computador, Tecnico tecnico) {
        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
        this.computador = computador;
        this.tecnico = tecnico;
        totalChamados++;
    }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Computador getComputador() { return computador; }
    public void setComputador(Computador computador) { this.computador = computador; }
    public Tecnico getTecnico() { return tecnico; }
    public void setTecnico(Tecnico tecnico) { this.tecnico = tecnico; }
    public static int getTotalChamados() { return totalChamados; }
    public void exibirDetalhes() {
        System.out.println("Chamado: " + numero);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + status);
        System.out.println("Computador: " + computador.modelo);
        System.out.println("Técnico: " + tecnico.getNome());
        System.out.println("-------------------------");
    }
}
