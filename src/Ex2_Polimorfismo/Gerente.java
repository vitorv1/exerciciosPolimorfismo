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

    public void setInfo(Funcionario funcionario, String nome, String idade, String cpf, String email, double salario, String senha) {
        super.setInfo(funcionario, nome, idade, cpf, email, salario);
        setSenha(senha);
    }
}
