public class Combo3 extends Combo {
    private String Streaming2 = "HBO";
    private String Streaming1 = "Amazon";

    public String getStreaming1() {
        return Streaming1;
    }
    public String getStreaming2() {
        return Streaming2;
    }


    public static int assinar(String cpf){
        Combo3 combo3 = new Combo3();
        combo3.setCliente(ClienteRepository.buscarCliente(cpf));
        combo3.setValor(20);
        ComboRepository.salvarCombo(combo3);
        return combo3.getNumeroCombo();
    }
}
