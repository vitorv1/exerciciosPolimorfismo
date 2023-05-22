package Ex2_Polimorfismo;

public abstract class Funcionario {
    private String nome;
    private String idade;
    private String cpf;
    private String email;
    private double salario;





    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setInfo(Funcionario funcionario, String nome, String idade, String cpf, String email, double salario){
      funcionario.setNome(nome);
      funcionario.setCpf(cpf);
      funcionario.setIdade(idade);
      funcionario.setEmail(email);
      funcionario.setSalario(salario);
    }

    public String getInfo (){
        
    }

}