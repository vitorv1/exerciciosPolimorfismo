package Streaming;

public enum Combos  {
    COMBO1 ("Netflix + HBO", 25, 123),
    COMBO2 ("Netflix + Amazon", 30, 456),
    COMBO3 ("HBO + Amazon", 20, 789);
    private String nome;
    private double valor;
    private int codigo;

    Combos(String nome, double valor, int codigo){
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getValor() {
        return valor;
    }
}
