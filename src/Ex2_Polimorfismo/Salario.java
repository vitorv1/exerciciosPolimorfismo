package Ex2_Polimorfismo;

public enum Salario {
    SALARRIOGERENTE(1, 3000),
    SALARIODESINGNER(2, 2500),
    SALARIOEDITORDEVIDEO(3, 2000);

    private int codigo;
    private double valor;

    Salario(int codigo, double valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public double folhaPagamento(Funcionario funcionario){
        double salario = funcionario.getSalario().getValor();
        salario = salario - (5/100);
        if(salario > 900 && salario <= 1500){
               
        }
    }
}
