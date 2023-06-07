package Ex2_Polimorfismo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Play {

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
        System.out.println("DIGITE O TIPO DE FUNCIONÁRIO QUE SERA CADASTRADO");
                switch (sc.next()) {
                    case "Gerente":
                        System.out.println("DIGITE RESPECTIVAMENTE O: NOME, IDADE, CPF, EMAIL");
                        Funcionario funcionarioGerente = new Gerente(sc.next(), sc.next(), sc.next(), sc.next());
                        FuncionarioRepository.salvar(funcionarioGerente);
                        System.out.println("CADASTRADO COM SUCESSO");
                    case "Editor De Video":
                        System.out.println("DIGITE RESPECTIVAMENTE O: NOME, IDADE, CPF, EMAIL");
                        Funcionario funcionarioEditorVideo = new EditorDeVideo(sc.next(), sc.next(), sc.next(), sc.next());
                        FuncionarioRepository.salvar(funcionarioEditorVideo);
                        System.out.println("CADASTRADO COM SUCESSO");
                    case "Designer":
                        System.out.println("DIGITE RESPECTIVAMENTE O: NOME, IDADE, CPF, EMAIL");
                        Funcionario funcionarioDesigner = new Designer(sc.next(), sc.next(), sc.next(), sc.next());
                        FuncionarioRepository.salvar(funcionarioDesigner);
                        System.out.println("CADASTRADO COM SUCESSO");
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
        System.out.println("CASO DESEJE ALTERAR TUDO, DIGITE 1");
        System.out.println("CASO DESEJE ALTERAR SOMENTE O NOME, DIGITE 2");
        System.out.println("CASO DESEJE ALTERAR SOMENTE IDADE, DIGITE 2");
        System.out.println("CASO DESEJE ALTERAR SOMENTE CPF, DIGITE 3");
        System.out.println("CASO DESEJE ALTERAR SOMENTE EMAIL, DIGITE 4");
        System.out.println("CASO DESEJE ALTERAR SOMENTE O CARGO, DIGITE 5");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("DIGITE RESPECTIVAMENTE OS NOVOS: NOME, IDADE, CPF, EMAIL, E CARGO");
                funcionario.setInfo(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                System.out.println("ALTERADO COM SUCESSSO");
            case 2:
                System.out.println("DIGITE O NOVO NOME: ");
                funcionario.setNome(sc.next());
                System.out.println("ALTERADO COM SUCESSSO: ");
            case 3 :
                System.out.println("DIGITE O NOVO CPF: ");
                funcionario.setCpf(sc.next());
                System.out.println("ALTERADO COM SUCESSSO:");
            case 4 :
                System.out.println("DIGITE O NOVO EMAIL: ");
                funcionario.setEmail(sc.next());
                System.out.println("ALTERADO COM SUCESSSO");
            case 5 :
                System.out.println("DIGITE O NOVO CARGO(GERENTE, EDITOR DE VIDEO, DESIGNER)");
                funcionario.setTipo(sc.next());
                System.out.println("ALTERADO COM SUCESSO");
        }
    }

    public static void menuDeletarFuncionario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O CPF DO FUNCIONARIO QUE DESEJA DELETAR:");
        FuncionarioRepository.deletar(sc.next());
        System.out.println("DELETADO COM SUCESSSO");
    }

    public static void menuFolhaPagamento(){

    }
    public static void main(String[] args) {
        //ideia de encaspular os metodos do main, talvez em uma outra classe.
        boolean stop = true;
        while (stop) {
            if ( menuPrincipal() == 1) {
                menuFuncionario();
                switch (menuFuncionario()){
                    case 1 : menuCadastroFuncionario();
                    case 2 : menuGetInfoFuncionarios();
                    case 3 : setInfoFuncionario();
                    case 4 : menuDeletarFuncionario();
                }
            } else{

            }
        }

    }
}
