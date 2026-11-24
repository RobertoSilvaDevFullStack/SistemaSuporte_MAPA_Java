public class TecnicoSoftware extends Tecnico implements Atendimento {
    public TecnicoSoftware(String nome) { super(nome, "Software"); }
    @Override
    public void realizarAtendimento() {
        System.out.println("Realizando diagnóstico e atualização de software.");
    }
}
