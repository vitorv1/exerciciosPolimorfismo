package Ex2_Polimorfismo;

public abstract class Funcionario {
    private String nome;
    private String idade;
    private String cpf;
    private String email;
    private Salario salario;

    public String tipo;
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
    public void setSalario (Salario salario){
        this.salario = salario;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public String getInfo (){
       return "NOME: " + getNome() + "IDADE: " + getIdade() + "CPF: " + getCpf() + "EMAIL: " + getEmail() + "TIPO DE FUNCIONÁRIO: " + getTipo();
    }

    public void setInfo(String nome, String idade, String cpf, String email, String tipo){
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setEmail(email);
        setTipo(tipo);
    }


}
