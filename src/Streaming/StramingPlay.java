package Streaming;

import java.util.Scanner;

public class StramingPlay {
    public static void menu(){
        System.out.println("Digite 1, para informações sobre cliente");
        System.out.println("Digite 2, para informações sobre combos");
    }
    public static void menuCliente(){
        System.out.println("Digite 1, para cadastrar cliente");
        System.out.println("Digite 2, para ver informções de clientes cadastrados cliente");
        System.out.println("Digite 3, para alterar informações de clientes");
        System.out.println("Digite 4, para deletar cliente");
    }
    public static void menuCadastroCliente(){
        Scanner sc = new Scanner(System.in);
        ClienteRepository clienteRepository = new ClienteRepository();
        System.out.println("Digite o nome, email e cpf do cliente a ser cadastrado");
        clienteRepository.salvarCliente(Cliente.criar(sc.next(), sc.next(), sc.next()));
        System.out.println("Cadastro concluido com sucesso");
    }
    public static void menuGetInfoClientes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cpf do cliente desejado");
        Cliente cliente = ClienteRepository.buscarCliente(sc.next());
        System.out.println("NOME:    " + cliente.getNome() + "  EMAIL:    " + cliente.getEmail() + "  CPF:   " + cliente.getCpf());
    }
    public static void menuSetCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cpf do cliente desejado");
        Cliente cliente = ClienteRepository.buscarCliente(sc.next());
        cliente.getCliente();
        System.out.println("Caso deseje alterar NOME, digite 1");
        System.out.println("Caso deseje alterar CPF, digite 2");
        System.out.println("Caso deseje alterar EMAIL, digite 3");
        int menuSet = sc.nextInt();
        if(menuSet == 1){
            System.out.println("Digite o nome do novo do cliente");
            cliente.setNome(sc.next());
            System.out.println("Alterado com sucesso");
            cliente.getCliente();
        }
        if(menuSet == 2){
            System.out.println("Digite o novo CPF do cliente");
            cliente.setCpf(sc.next());
            System.out.println("Alterado com sucesso");
            cliente.getCliente();
        }
        if(menuSet == 3){
            System.out.println("Digite o novo EMAIL do cliente");
            cliente.setEmail(sc.next());
            System.out.println("Alterado com sucesso");
            cliente.getCliente();
        }
    }
    public static void deletarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o CPF do cliente a ser deletado");
        ClienteRepository.deletarCliente(sc.next());
        System.out.println("Deletado com sucesso");
    }
    public static void menuCombo(){
        System.out.println("Digite 1, para assinar combo");
        System.out.println("Digite 2, para ver informações da assinatura");
        System.out.println("Digite 3, para cancelar assinatura");
    }
    public static void assinarCombo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu CPF");
        Cliente cliente = ClienteRepository.buscarCliente(sc.next());
        System.out.println("Os combos disponíveis são:");
        System.out.println("Combo 1: Netflix + HBO por R$25");
        System.out.println("Combo 2: Netflix + Amazon por R$30");
        System.out.println("Combo 3: Amazon + HBO por R$20");
        System.out.println("Para assinar o combo 1, digite 1");
        System.out.println("Para assinar o combo 2, digite 2");
        System.out.println("Para assinar o combo 3, digite 3");
        int menuAssinarCombo = sc.nextInt();
        if(menuAssinarCombo == 1){
            System.out.println("O numero do seu pedido:  " + Pedido.criarPedido(cliente, Combos.COMBO1));
        }
        if(menuAssinarCombo == 2){
            System.out.println("O numero do seu pedido:  " + Pedido.criarPedido(cliente, Combos.COMBO2));
        }
        if(menuAssinarCombo == 3){
            System.out.println("O numero do seu pedido:  " + Pedido.criarPedido(cliente, Combos.COMBO3));
        }
    }
    public static void getInfoCombo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do seu Pedido");
        System.out.println("NUMERO: " + combo.getNumeroCombo() + " VALOR  R$:" + combo.getValor());
        System.out.println("NOME DO CLIENTE:  " + combo.getCliente().getNome() + "  CPF DO CLIENTE:  " + combo.getCliente().getCpf());
        if(combo.getValor() == 25){
            System.out.println("ITENS DO COMBO: Netflix e HBO" );
        }
        else if (combo.getValor() == 30){
            System.out.println("ITENS DO COMBO: Netflix e Amazon");
        }else{
            System.out.println("ITENS DO PEDIDO: Amazon e HBO");
        }
    }
    public static void menuCancelarCombo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dgite o numero da assinatura que deseja cancelar");
        ProdutoRepository.deletarProduto(sc.nextInt());
        System.out.println("Cancelado com sucesso");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            menu();
            int menu = sc.nextInt();
            if(menu == 1){
                menuCliente();
                int menu1 = sc.nextInt();
                if(menu1 == 1){
                    menuCadastroCliente();
                }
                if(menu1 == 2){
                    menuGetInfoClientes();
                }
                if(menu1 == 3){
                    menuSetCliente();
                }
                if (menu1 == 4){
                    deletarCliente();
                }
            }else {
                menuCombo();
                int menu2 = sc.nextInt();
                if(menu2 == 1){
                    assinarCombo();
                }
                if(menu2 == 2){
                    getInfoCombo();
                }
                if(menu2 == 3){
                    menuCancelarCombo();
                }
            }
            System.out.println("Caso deseje continuar digite 'sim' ou 'nao'");
            if(sc.next().equals("nao")){
                loop = false;
            }
        }
    }
}