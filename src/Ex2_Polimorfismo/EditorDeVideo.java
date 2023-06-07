package Ex2_Polimorfismo;

import java.util.Random;

public class EditorDeVideo extends Funcionario{
    public EditorDeVideo(String nome, String idade, String cpf, String email){
        super.setSalario(Salario.SALARIOEDITORDEVIDEO);
        super.setNome(nome);
        super.setIdade(idade);
        super.setCpf(cpf);
        super.setEmail(email);
        super.setTipo("Editor de video");
    }
}
