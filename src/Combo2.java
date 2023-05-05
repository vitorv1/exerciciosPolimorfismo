public class Combo2 extends Combo {
    private String Streaming2 = "Amazon";
    private String Streaming1 = "Netflix";

    public String getStreaming1() {
        return Streaming1;
    }
    public String getStreaming2() {
        return Streaming2;
    }


    public static int assinar(String cpf){
        Combo2 combo2 = new Combo2();
        combo2.setCliente(ClienteRepository.buscarCliente(cpf));
        combo2.setValor(30);
        ComboRepository.salvarCombo(combo2);
        return combo2.getNumeroCombo();
    }
}
