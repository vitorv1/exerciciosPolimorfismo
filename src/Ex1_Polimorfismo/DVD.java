package Ex1_Polimorfismo;

import java.util.Scanner;

public class DVD extends Midia{
    private int nFaixas;

    public DVD (int codigo, double preco, String nome, int nFaixas){
        super(codigo, preco, nome);
        setnFaixas(nFaixas);
    }

    DVD(){
        this(0, 0.0, "Nenhum", 0);
    }

    public int getnFaixas() {
        return nFaixas;
    }
    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public String getTipo(){
        return "DVD";
    }

    public String getDetalhes(){
         return super.getDetalhes() + "/n" +
                 "numeros de faixas" + getnFaixas();
    }

    public void printDetalhes (){
        System.out.println("DETALEHES DA CLASSE " + getDetalhes());
        System.out.println("TIPO DA CLASSE " + getTipo());
    }

    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        super.inserirDadods();
        System.out.println("Digite o números de faixas");
        setnFaixas(sc.nextInt());
    }

}
