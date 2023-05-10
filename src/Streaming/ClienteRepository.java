package Streaming;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    static List<Cliente> clientes = new ArrayList<Cliente>();

    public void salvarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public static void deletarCliente(String cpf){
        clientes.remove(clientes.stream().filter(cliente2 -> cliente2.getCpf().equals(cpf)).findFirst().orElseThrow(()->new RuntimeException("cliente não encontrada")));
    }
    public static Cliente buscarCliente(String cpf){
        return clientes.stream().filter(cliente -> cliente.getCpf().equals(cpf)).findFirst().orElseThrow(() -> new RuntimeException("Streaming.Cliente não encontrado"));
    }

}
