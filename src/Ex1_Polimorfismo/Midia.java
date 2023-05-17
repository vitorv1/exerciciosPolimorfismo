package Ex1_Polimorfismo;

import java.util.Scanner;

public  class Midia {
    private int codigo;
    private double preco;
    private String nome;


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Midia(int codigo, double preco, String nome){
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
    }
    Midia(){
        this(0, 0.0, "Nenhum");
    }

    public String getTipo(){
        return "Mídia";
    }
    public String getDetalhes(){
        return  "NOME " + getNome() + "/n" +
                "CÓDIGO " + getCodigo() + "/n" +
                "PRECO " + getPreco();
    }
    public void printDados(){
        System.out.println("TIPO DA CLASSE: " + getTipo());
        System.out.println("DETALHES DA CLASSE " + getDetalhes());
    }
    public void inserirDadods(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da Mídia");
        setNome(sc.next());
        System.out.println("Digite o codigo da Mídia");
        setCodigo(sc.nextInt());
        System.out.println("Digite o preco da mídia");
        setPreco(sc.nextDouble());
    }
}
