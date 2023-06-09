package Ex2_Polimorfismo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        //ideia de encaspular os metodos do main, talvez em uma outra classe.
        boolean stop = true;
        while (stop) {
            if ( Menu.menuPrincipal() == 1) {
                int menu = Menu.menuFuncionario();
                if(menu == 1){
                    Menu.menuCadastroFuncionario();
                }else if(menu == 2){
                    Menu.menuGetInfoFuncionarios();
                } else if (menu == 3){
                    Menu.setInfoFuncionario();
                } else if (menu == 4){
                    Menu.menuDeletarFuncionario();
                }
            } else{
                Menu.menuFolhaPagamento();
            }
            stop = Menu.menuValidacao();
        }
    }
}
