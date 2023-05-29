package Ex2_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public abstract class FuncionarioRepository {
    static List <Funcionario> funcionarios = new ArrayList<Funcionario>();
    public static void salvar(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public static void deletar(String cpf){
        funcionarios.remove(funcionarios.stream().filter(funcionario -> funcionario.getCpf().equals(cpf)).findFirst().orElseThrow(()-> new RuntimeException("FUNCIONÁRIO NÃO ENCONTRADO")));
    }
    public static Funcionario buscar(String cpf){
        return funcionarios.stream().filter(funcionario -> funcionario.getCpf().equals(cpf)).findFirst().orElseThrow(()-> new RuntimeException("FUNCIONÁRIO NÃO ENCONTRADO"));
    }
}
