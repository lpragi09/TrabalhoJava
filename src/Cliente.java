public class Cliente {
    // Atributos (variáveis) - semana 2: ainda com acesso direto (sem encapsulamento)
    public String nome;
    public String telefone;

    // Método para exibir as informações do cliente no console
    public void exibirDados() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "\n  Nome: " + nome +
                "\n  Telefone: " + telefone +
                "\n}";
    }
}

