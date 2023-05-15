package Streaming;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido {
    private int numero;

    private double valor;

    private Cliente cliente;

    List<Combos> combos = new ArrayList<Combos>();

    public static double criarPedido(Cliente cliente, Combos combo){
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.combos.add(combo);
        pedido.setValor(combo.getValor());
        Random random = new Random();
        pedido.setNumero(random.nextInt(100));
        PedidoRepository.salvarPedido(pedido);
        return pedido.getNumero();
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}
