package Ex1_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public abstract class DVDRepository {

    static List<DVD> dvds = new ArrayList<DVD>();

    public static void salvar (DVD dvd){
        dvds.add(dvd);
    }
    public static DVD getDvd(DVD dvd){
        return dvds.stream().filter(DVD -> DVD.getCodigo() == dvd.getCodigo()).findFirst().orElseThrow(()-> new RuntimeException("PRODUTO NÃO ENCONTRADO"));
    }
}
