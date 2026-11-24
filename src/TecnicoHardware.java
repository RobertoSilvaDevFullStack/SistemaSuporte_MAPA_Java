public class TecnicoHardware extends Tecnico implements Atendimento {
    public TecnicoHardware(String nome) { super(nome, "Hardware"); }
    @Override
    public void realizarAtendimento() {
        System.out.println("Realizando manutenção física do computador.");
    }
}
