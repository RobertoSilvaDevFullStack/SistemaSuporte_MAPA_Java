public class SistemaSuporte {
    public static void main(String[] args) {
        String nomeSistema = "IT Solutions";
        String versaoSistema = "1.0.0";
        String nomeTecnico = "Roberto Silva";
        int chamadosAbertos = 10;
        boolean sistemaAtivo = true;
        System.out.println("Nome: " + nomeSistema);
        System.out.println("Versão: " + versaoSistema);
        System.out.println("Técnico: " + nomeTecnico);
        System.out.println("Chamados Abertos: " + chamadosAbertos);
        System.out.println("Sistema Ativo: " + sistemaAtivo);
        if (chamadosAbertos > 0) {
            System.out.println("Existem chamados aguardando atendimento");
        } else {
            System.out.println("Nenhum chamado pendente");
        }
    }
}
