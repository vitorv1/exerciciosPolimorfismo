import java.util.Random;

public class Combo1 extends Combo {
    /*public int assinarCombo(String cpf){
        Combo1 combo1 = new Combo1();
        combo1.setCliente(cliente);
        combo1.setValor(25);
        ComboRepository.salvarCombo(combo1);
        return getNumeroCombo();
    }*/

    public static int assinar(String cpf){
        Combo1 combo1 = new Combo1();
        combo1.setCliente(ClienteRepository.buscarCliente(cpf));
        combo1.setValor(25);
        ComboRepository.salvarCombo(combo1);
        return combo1.getNumeroCombo();
    }
}
