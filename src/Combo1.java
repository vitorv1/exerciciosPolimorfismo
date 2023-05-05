public class Combo1 extends Combo {
    private String Streaming1 = "Netflix";
    private String Streaming2 = "HBO";

    public String getStreaming1() {
        return Streaming1;
    }
    public String getStreaming2() {
        return Streaming2;
    }

    public static int assinar(String cpf){
        Combo1 combo1 = new Combo1();
        combo1.setCliente(ClienteRepository.buscarCliente(cpf));
        combo1.setValor(25);
        ComboRepository.salvarCombo(combo1);
        return combo1.getNumeroCombo();
    }
}
