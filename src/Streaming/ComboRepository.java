package Streaming;

import java.util.ArrayList;
import java.util.List;

public abstract class ComboRepository {
    static List<Combo> combos = new ArrayList<Combo>();

    public static void  salvarCombo(Combo combo){
       combos.add(combo);
    }
    public static void  deletarCombo(int numeroCombo){
        combos.remove(buscarComboPorNumero(numeroCombo));
    }
    public static Combo buscarComboPorNumero(int numero){
        return combos.stream().filter(combo -> combo.getNumeroCombo() == numero).findFirst().orElseThrow(() -> new RuntimeException("Assinatura não encontrada"));
    }
}
