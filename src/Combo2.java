public class Combo2 extends Combo implements AssinaturaCombo{
    public void assinar(Cliente cliente){
        Combo2 combo2 = new Combo2();
        setCliente(cliente);
        setValor(30);
        ComboRepository.salvarCombo(combo2);
    }
}
