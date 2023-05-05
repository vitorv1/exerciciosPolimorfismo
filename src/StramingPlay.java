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
        System.out.println("Caso deseje alterar NOME, digite 1");
        System.out.println("Caso deseje alterar CPF, digite 2");
        System.out.println("Caso deseje alterar EMAIL, digite 3");
        int menuSet = sc.nextInt();
        if(menuSet == 1){
            System.out.println("Digite o nome do novo do cliente");
            cliente.setNome(sc.next());
        }
        if(menuSet == 2){
            System.out.println("Digite o novo CPF do cliente");
            cliente.setCpf(sc.next());
        }
        if(menuSet == 3){
            System.out.println("Digite o novo EMAIL do cliente");
            cliente.setEmail(sc.next());
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
        System.out.println("Os combos disponíveis são:");
        System.out.println("Combo 1: Netflix + HBO por R$25");
        System.out.println("Combo 2: Netflix + Amazon por R$30");
        System.out.println("Combo 3: Amazon + HBO por R$20");
        System.out.println("Para assinar o combo 1, digite 1");
        System.out.println("Para assinar o combo 2, digite 2");
        System.out.println("Para assinar o combo 3, digite 3");
        int menuAssinarCombo = sc.nextInt();
        if(menuAssinarCombo == 1){
            System.out.println("Digite o seu CPF");
            System.out.println("O numero da sua Assinatura é:   " + Combo1.assinar(sc.next()));
            System.out.println("Sua assinatura foi concluida com sucesso");
        }
        if(menuAssinarCombo == 2){
            System.out.println("Digite o seu CPF");
            System.out.println("O numero da sua Assinatura é:   " + Combo2.assinar(sc.next()));
            System.out.println("Sua assinatura foi concluida com sucesso");
        }
        if(menuAssinarCombo == 3){
            System.out.println("Digite o seu CPF");
            System.out.println("O numero de sua Assinatura é:   " +  Combo3.assinar(sc.next()));
            System.out.println("Sua assinatura foi concluida com sucesso");
        }

    }
    public static void getInfoAssinatura(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da sua Assinatura");
        Combo combo = ComboRepository.buscarComboPorNumero(sc.nextInt());
        System.out.println("NUMERO: " + combo.getNumeroCombo() + " VALOR  ");
    }
    public static void menuAssinarCombo(){

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

                }
                if(menu2 == 3){

                }
            }
        }
    }
}