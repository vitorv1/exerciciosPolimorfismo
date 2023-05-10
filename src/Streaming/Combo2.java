package Streaming;

public class Combo2 extends Combo {

    public static int assinar(String cpf){
        Combo2 combo2 = new Combo2();
        combo2.setCliente(ClienteRepository.buscarCliente(cpf));
        combo2.setValor(30);
        ComboRepository.salvarCombo(combo2);
        return combo2.getNumeroCombo();
    }
}
