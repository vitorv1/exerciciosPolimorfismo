package Ex2_Polimorfismo;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, String idade, String cpf, String email){
        super.setSalario(Salario.SALARIOEDITORDEVIDEO);
        super.setNome(nome);
        super.setIdade(idade);
        super.setCpf(cpf);
        super.setEmail(email);
        super.setTipo("Editor de video");
    }
}
