package Ex2_Polimorfismo;

import java.util.Random;

public class Gerente extends Funcionario{
    private int senha;

    public Gerente(String nome, String idade, String cpf, String email){
        Random random = new Random();
        super.setNome(nome);
        super.setIdade(idade);
        super.setCpf(cpf);
        super.setEmail(email);
        setSenha(random.nextInt(100));
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + getSenha();
    }

}
