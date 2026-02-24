public class Cliente {
    // Atributos (variáveis) - semana 3: encapsulamento (private)
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        setNome(nome);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone do cliente não pode ser vazio.");
        }
        this.telefone = telefone.trim();
    }

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

