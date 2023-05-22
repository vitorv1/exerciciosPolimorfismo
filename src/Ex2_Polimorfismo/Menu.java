package Ex2_Polimorfismo;

public enum Menu {
    MENUPRINCIPAL(0, "ASSUNTOS RELACIONADOS A FUNCIONARIO, DIGITE 1" + "/n" + " ASSUNTOS RELACIONADOS A FOLHA DE PAGAMENTO, DIGITE 2"),
    MENUFUNCIONARIO(1, "PARA CADASTRAR NOVO FUNCIONÁRIO DIGITE 2" + "/n" + "PARA VER ALGUMA INFORMAÇÃ0 DE FUNCIONÁRIO DIGITE 3" + "/n" + "PARA ALTERAR ALGUMA INFORMAÇÃO DE FUNCIONÁRIO DIGITE 3" + "/n" +
            "PARA DELETAR ALGUM FUNCIONÁRIO DIGITE 5"),
    MENUFOLHAPAGAMETNO(2, "");

    private int codigo;
    private String descricao;

     Menu(int codigo, String descricao){
         this.codigo = codigo;
         this.descricao = descricao;
     }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
