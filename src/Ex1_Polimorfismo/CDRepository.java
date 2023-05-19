package Ex1_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public abstract class CDRepository {
    static List<CD> cds = new ArrayList<CD>();

    public static void salvar(CD cd){
        cds.add(cd);
    }
    public static CD getCd(CD cd){
        return cds.stream().filter(CD -> CD.getCodigo() == cd.getCodigo()).findFirst().orElseThrow(()-> new RuntimeException("PRODUTO NÃO ENCONTRADO"));
    }
}
