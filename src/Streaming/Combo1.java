package Streaming;

public class Combo1 extends Combo implements AssinarCombo{

    @Override
    public Combo assinarCombo() {
        return new Combo1();
    }

    public static int assinar(String cpf){
        Combo1 combo1 = new Combo1();
        combo1.setCliente(ClienteRepository.buscarCliente(cpf));
        combo1.setValor(25);
        ComboRepository.salvarCombo(combo1);
        return combo1.getNumeroCombo();
    }
}