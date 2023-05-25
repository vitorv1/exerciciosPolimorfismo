package Ex2_Polimorfismo;

public class Gerente extends Funcionario{
    private String senha;

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getSenha();
    }

}
