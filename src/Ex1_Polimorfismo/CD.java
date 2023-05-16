package Ex1_Polimorfismo;

import java.util.Scanner;

public class CD extends Midia{
    private int nuMusicas;

    public int getNuMusicas() {
        return nuMusicas;
    }
    public void setNuMusicas(int nmus) {
        nuMusicas = (nmus > 0) ? nmus : 0;
    }

    public CD (String nome, int codigo, double preco, int nuMusicas){
        super(codigo, preco, nome);
        setNuMusicas(nuMusicas);
    }
    CD(){
      this("Nenhum", 0, 0.0,0 );
    }
    public String getTipo(){
        return "CD";
    }
    public String getDetalhes(){
        return super.getDetalhes() + "n/" +
               "Numero de faixas " + getNuMusicas();
    }
    public void printDados(){
        System.out.println("TIPO DA CLASSE " + getTipo());
        System.out.println("DETALHES DA CLASSE " + getDetalhes());
    }
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        super.inserirDadods();
        System.out.println("Digite o numero de musicas");
        setNuMusicas(sc.nextInt());
    }
}
