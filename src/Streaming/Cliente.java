package Streaming;

public class Cliente{
        private String email;
        private String nome;
        private String cpf;
        public static Cliente criar(String nome, String email, String cpf){
                Cliente cliente = new Cliente();
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setEmail(email);
                return cliente;
        }
        public String getNome() {
                return nome;
        }
        public void setNome(String nome) {
                this.nome = nome;
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

        public void getCliente(){
                System.out.println("NOME:  " + getNome() + "  CPF:  " + getCpf() + "  EMAIL:  " + getEmail());
        }
}
