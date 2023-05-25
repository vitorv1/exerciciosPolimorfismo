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

}
