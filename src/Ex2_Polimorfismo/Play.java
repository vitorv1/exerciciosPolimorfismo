package Ex2_Polimorfismo;

import java.util.Scanner;

public class Play {

    public static void menuPrincipal(){
        System.out.println("ASSUNTOS RELACIONADOS A FUNCIONARIOS DIGITE 1");
        System.out.println("ASSUNTOS RELACIONADOS A FOLHA DE PAGAMENTO DIGITE 2");
    }
    public static void menuFuncionario(){
        System.out.println("PARA CADASTRAR NOVO FUNCIONÁRIO DIGITE 1");
        System.out.println("PARA VER INFORMAÇÕES DE FUNCIONARIO DIGITE 2");
        System.out.println("PARA ALTERAR INFORMAÇÕES DE FUNCIONÁRIO DIGITE 3");
        System.out.println("PARA DELETAR UM FUNCIONÁRIO DIGITE 4");
    }
    public static void menuCadastroFuncionario(){
        System.out.println("DIGITE RESPECTIVAMENTE O: NOME, IDADE, CPF, EMAIL, TIPO DE FUNCIONÁRIO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menuPrincipal();
        if(sc.nextInt() == 1){
            menuFuncionario();
            String funcionario;
            switch (sc.next()){
                case :
            }
        }else{

        }

    }
}
