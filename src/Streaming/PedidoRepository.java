package Streaming;

import java.util.ArrayList;
import java.util.List;
public abstract class PedidoRepository {
     static List<Pedido> pedidos = new ArrayList<Pedido>();
    public static void salvarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public static void buscarPedido(int numeroPedido){
        pedidos.stream().filter(Pedido -> Pedido.getNumero() == numeroPedido).findFirst().orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }
}
