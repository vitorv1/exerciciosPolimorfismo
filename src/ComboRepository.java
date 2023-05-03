import java.util.ArrayList;
import java.util.List;

public abstract class ComboRepository {
    static List<Combo> combos = new ArrayList<Combo>();

    public static void  salvarCombo(Combo combo){
       combos.add(combo);
    }
    public static void  deletarCombo(String cpf){
        combos.remove(combos.stream().filter(combo2 -> combo2.getCliente().getCpf().equals(cpf)).findFirst().orElseThrow(() -> new RuntimeException("Combo não encontrado")));
    }
}
