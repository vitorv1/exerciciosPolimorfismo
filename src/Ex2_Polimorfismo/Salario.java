package Ex2_Polimorfismo;

import java.util.SimpleTimeZone;

public enum Salario {
    SALARRIOGERENTE( 3000),
    SALARIODESINGNER( 2500),
    SALARIOEDITORDEVIDEO( 2000);

    private double valor;

    Salario(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public static double calculoPorcentagem(double valor, int porcentagem){
        valor = valor * porcentagem;
        return valor = valor / 100;
    }
    public static double folhaPagamento(Funcionario funcionario){
        double salario = funcionario.getSalario().getValor();
        if(salario >= 900 && salario <= 1500){
            salario = salario - calculoPorcentagem(salario, 5);
            funcionario.setDesconto(5);
        } else if (salario <=2500) {
            salario = salario - calculoPorcentagem(salario, 10);
            funcionario.setDesconto(10);
        }
        else {
            salario = salario - calculoPorcentagem(salario, 20);
            funcionario.setDesconto(20);
        }
        return salario = salario - (5/100);
    }
}
