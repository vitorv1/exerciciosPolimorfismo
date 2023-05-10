package Streaming;

public class Combo3 extends Combo {

    public static int assinar(String cpf){
        Combo3 combo3 = new Combo3();
        combo3.setCliente(ClienteRepository.buscarCliente(cpf));
        combo3.setValor(20);
        ComboRepository.salvarCombo(combo3);
        return combo3.getNumeroCombo();
    }
}
