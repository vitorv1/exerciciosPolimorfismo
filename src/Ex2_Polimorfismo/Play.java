package Ex2_Polimorfismo;
public class Play {
    public static void main(String[] args) {
        //ideia de encaspular os metodos do main, talvez em uma outra classe.
        boolean stop = true;
        while (stop) {
            if(Menu.menuPrincipal() == 1){
              switch (Menu.menuFuncionario()){
                  case 1 : Menu.menuCadastroFuncionario();
                  break;
                  case 2 : Menu.menuGetInfoFuncionarios();
                  break;
                  case 3 : Menu.setInfoFuncionario();
                  break;
                  case 4 : Menu.menuDeletarFuncionario();
                  break;
              }
            } else{
                Menu.menuFolhaPagamento();
            }
            stop = Menu.menuValidacao();
        }
    }
}
