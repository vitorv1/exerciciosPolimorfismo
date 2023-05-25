package Ex2_Polimorfismo;

public class FunicionarioFactoryImpl implements FuncionarioFactory {


    @Override
    public Funcionario assinarCOntrato(String nome, String cpf, String idade, String email, String tipoFuncionario) {
        if(tipoFuncionario.equalsIgnoreCase("Designer")){
            Funcionario desinger = new Designer();
            desinger.setNome(nome);
            desinger.setCpf(cpf);
            desinger.setIdade(idade);
            desinger.setEmail(email);
            return desinger;
        } else if(tipoFuncionario.equalsIgnoreCase("Editor de Video")){
            Funcionario editorDeVideo = new EditorDeVideo();
            editorDeVideo.setNome(nome);
            editorDeVideo.setCpf(cpf);
            editorDeVideo.setIdade(idade);
            editorDeVideo.setEmail(email);
            return editorDeVideo;
        }
        else{
            Funcionario gerente = new Gerente();
            gerente.setNome(nome);
            gerente.setCpf(cpf);
            gerente.setIdade(idade);
            gerente.setEmail(email);
            return gerente;
        }
    }
}
