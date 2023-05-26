package Ex2_Polimorfismo;

import java.util.Random;

public class Designer extends Funcionario {
    public Designer(String nome, String idade, String cpf, String email){
        super.setNome(nome);
        super.setIdade(idade);
        super.setCpf(cpf);
        super.setEmail(email);
    }
}
