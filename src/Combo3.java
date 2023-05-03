public class Combo3 extends Combo implements AssinaturaCombo{
    public void assinar(Cliente cliente){
        Combo3 combo3 = new Combo3();
        setCliente(cliente);
        setValor(20);
        ComboRepository.salvarCombo(combo3);
    }
}
