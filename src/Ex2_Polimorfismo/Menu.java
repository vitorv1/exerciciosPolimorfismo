package Ex2_Polimorfismo;

import java.util.Scanner;

public abstract class Menu {
    public static int menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ASSUNTOS RELACIONADOS A FUNCIONARIOS DIGITE 1");
        System.out.println("ASSUNTOS RELACIONADOS A FOLHA DE PAGAMENTO DIGITE 2");
        return sc.nextInt();
    }
    public static int menuFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PARA CADASTRAR NOVO FUNCIONÁRIO DIGITE 1");
        System.out.println("PARA VER INFORMAÇÕES DE FUNCIONARIO DIGITE 2");
        System.out.println("PARA ALTERAR INFORMAÇÕES DE FUNCIONÁRIO DIGITE 3");
        System.out.println("PARA DELETAR UM FUNCIONÁRIO DIGITE 4");
        return sc.nextInt();
    }
    public static void menuCadastroFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O TIPO DE FUNCIONÁRIO QUE SERA CADASTRADO | 1 - Gerente | 2 = Vendedor | 3 - Designer");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("DIGITE RESPECTIVAMENTE O: NOME, IDADE, CPF, EMAIL");
                Funcionario funcionarioGerente = new Gerente(sc.next(), sc.next(), sc.next(), sc.next());
                FuncionarioRepository.salvar(funcionarioGerente);
                System.out.println("CADASTRADO COM SUCESSO");
                break;
            case 2:
                System.out.println("DIGITE RESPECTIVAMENTE O: NOME, IDADE, CPF, EMAIL");
                Funcionario funcionarioVendedor = new Vendedor(sc.next(), sc.next(), sc.next(), sc.next());
                FuncionarioRepository.salvar(funcionarioVendedor);
                System.out.println("CADASTRADO COM SUCESSO");
                break;
            case 3:
                System.out.println("DIGITE RESPECTIVAMENTE O: NOME, IDADE, CPF, EMAIL");
                Funcionario funcionarioDesigner = new Designer(sc.next(), sc.next(), sc.next(), sc.next());
                FuncionarioRepository.salvar(funcionarioDesigner);
                System.out.println("CADASTRADO COM SUCESSO");
                break;
        }
    }
    public static void menuGetInfoFuncionarios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O CPF DO FUNCIONÁRIO DESEJADO: ");
        System.out.println(FuncionarioRepository.buscar(sc.next()).getInfo());
    }
    public static void setInfoFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O CPF DO FUNCIONÁRIO DESEJADO");
        Funcionario funcionario = FuncionarioRepository.buscar(sc.next());
        System.out.println(funcionario.getInfo());
        System.out.println("CASO DESEJE ALTERAR TUDO, DIGITE 1");
        System.out.println("CASO DESEJE ALTERAR SOMENTE O NOME, DIGITE 2");
        System.out.println("CASO DESEJE ALTERAR SOMENTE CPF, DIGITE 3");
        System.out.println("CASO DESEJE ALTERAR SOMENTE EMAIL, DIGITE 4");
        System.out.println("CASO DESEJE ALTERAR SOMENTE O CARGO, DIGITE 5");
        System.out.println("CASO DESEJE ALTERAR SOMENTE A IDADE, DIGITE 6");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("DIGITE RESPECTIVAMENTE OS NOVOS: NOME, IDADE, CPF, EMAIL, E CARGO(1 - GERENTE | 2 - VENDEDOR | 3 - DESIGNER)");
                funcionario.setInfo(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
                System.out.println("ALTERADO COM SUCESSSO");
                break;
            case 2:
                System.out.println("DIGITE O NOVO NOME: ");
                funcionario.setNome(sc.next());
                System.out.println("ALTERADO COM SUCESSSO: ");
                break;
            case 3 :
                System.out.println("DIGITE O NOVO CPF: ");
                funcionario.setCpf(sc.next());
                System.out.println("ALTERADO COM SUCESSSO:");
                break;
            case 4 :
                System.out.println("DIGITE O NOVO EMAIL: ");
                funcionario.setEmail(sc.next());
                System.out.println("ALTERADO COM SUCESSSO");
                break;
            case 5 :
                System.out.println("DIGITE O NOVO CARGO( 1 - GERENTE | 2 - VENDEDOR | 3 - DESIGNER)");
                funcionario.setTipo(sc.nextInt());
                switch (funcionario.getTipo()){
                    case 1: funcionario.setSalario(Salario.SALARRIOGERENTE);
                    break;
                    case 2: funcionario.setSalario(Salario.SALARIOEDITORDEVIDEO);
                    break;
                    case 3: funcionario.setSalario(Salario.SALARIODESINGNER);
                    break;
                }
                System.out.println("ALTERADO COM SUCESSO");
                break;
            case 6 :
                System.out.println("DIGITE A NOVA IDADE: ");
                funcionario.setIdade(sc.next());
                System.out.println("ALTERADO COM SUCESSO");
                break;
        }
        System.out.println(funcionario.getInfo());
    }

    public static void menuDeletarFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O CPF DO FUNCIONARIO QUE DESEJA DELETAR:");
        FuncionarioRepository.deletar(sc.next());
        System.out.println("DELETADO COM SUCESSSO");
    }

    public static void menuFolhaPagamento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O CPF DO FUNCIONÁRIO");
        Funcionario funcionario = FuncionarioRepository.buscar(sc.next());
        double salario = Salario.folhaPagamento(funcionario);
        System.out.println("NOME: " + funcionario.getNome() + "  " + "CARGO: " + funcionario.validaTipo(funcionario.getTipo()) + "  " + "SALARIO BRUTO: " + funcionario.getSalario().getValor());
        System.out.println("SALARIO LINQUIDO: " + salario + "  " + "DESCONTOS: " + "5% DO SINDICATO" + " + " + funcionario.getDesconto() + "% " + " DE IMPOSTO DE RENDA");
    }
    public static boolean menuValidacao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("CASO DESEJE CONTINUAR DIGIE SIM OU NAO");
        if(sc.next().equalsIgnoreCase("NAO")){
            return false;
        }else{
            return true;
        }
    }
}
