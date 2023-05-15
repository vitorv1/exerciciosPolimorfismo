package Streaming;

import java.util.Random;

public  class Produto{
    private int valor;
    private int numeroCombo;
    private Cliente cliente;

    public Produto(){
        Random random = new Random();
        setNumeroCombo(random.nextInt(100));
    }

    public void setNumeroCombo(int numeroCombo) {
        this.numeroCombo = numeroCombo;
    }
    public int getNumeroCombo() {
        return numeroCombo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
