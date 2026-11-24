import java.util.Scanner;
import java.util.InputMismatchException;
public class Principal {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE SUPORTE ===");
        Computador computador1 = new Computador();
        computador1.patrimonio = "PAT001";
        computador1.modelo = "Dell OptiPlex";
        computador1.sistemaOperacional = "Windows 11";
        computador1.ligar();
        Computador computador2 = new Computador();
        computador2.patrimonio = "PAT002";
        computador2.modelo = "Lenovo ThinkCentre";
        computador2.sistemaOperacional = "Ubuntu";
        computador2.desligar();
        System.out.println("\n=== COMPUTADORES ===");
        computador1.exibirInformacoes();
        System.out.println("-------------------------");
        computador2.exibirInformacoes();
        TecnicoHardware tecnico1 = new TecnicoHardware("Roberto Silva");
        TecnicoSoftware tecnico2 = new TecnicoSoftware("Ana Souza");
        System.out.println("\n=== ATENDIMENTOS ===");
        Tecnico tecnicoReferencia = tecnico1;
        if (tecnicoReferencia instanceof Atendimento) {
            ((Atendimento) tecnicoReferencia).realizarAtendimento();
        }
        tecnicoReferencia = tecnico2;
        if (tecnicoReferencia instanceof Atendimento) {
            ((Atendimento) tecnicoReferencia).realizarAtendimento();
        }
        Scanner scanner = new Scanner(System.in);
        int numeroInformado = 0;
        System.out.println("\n=== CADASTRO DE CHAMADOS ===");
        try {
            System.out.print("Digite o número do chamado: ");
            numeroInformado = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro válido.");
            scanner.nextLine();
            numeroInformado = 1001;
            System.out.println("Número padrão utilizado: " + numeroInformado);
        }
        Chamado chamado1 = new Chamado(numeroInformado, "Computador não liga", "Aberto", computador1, tecnico1);
        Chamado chamado2 = new Chamado(numeroInformado + 1, "Sistema operacional lento", "Em atendimento", computador2, tecnico2);
        Chamado chamado3 = new Chamado(numeroInformado + 2, "Problema de memória RAM", "Aberto", computador1, tecnico1);
        System.out.println("\n=== DETALHES DOS CHAMADOS ===");
        chamado1.exibirDetalhes();
        chamado2.exibirDetalhes();
        chamado3.exibirDetalhes();
        System.out.println("Total de chamados criados: " + Chamado.getTotalChamados());
        scanner.close();
    }
}
