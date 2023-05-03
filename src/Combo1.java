public class Combo1 extends Combo implements AssinaturaCombo{
    public void assinar(Cliente cliente){
        Combo1 combo1 = new Combo1();
        setCliente(cliente);
        setValor(25);
        ComboRepository.salvarCombo(combo1);
    }
}
