package Streaming;

import java.util.ArrayList;
import java.util.List;

public abstract class ProdutoRepository {
    static List<Produto> combos = new ArrayList<Produto>();

    public static void  salvarCombo(Produto combo){
       combos.add(combo);
    }
    public static void  deletarProduto(int codigoProduto){
        combos.remove(buscarProdutoPorNumero(codigoProduto));
    }
    public static Produto buscarProdutoPorNumero(int codigo){
        return combos.stream().filter(combo -> combo.getNumeroCombo() == codigo).findFirst().orElseThrow(() -> new RuntimeException("Assinatura não encontrada"));
    }
}
