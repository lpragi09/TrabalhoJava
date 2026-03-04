public class Usuario {
    private String nome;
    private String email;
    private String telefone;

    public Usuario(String nome, String email, String telefone) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do usuário não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email do usuário não pode ser vazio.");
        }
        this.email = email.trim();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone do usuário não pode ser vazio.");
        }
        this.telefone = telefone.trim();
    }

    // Método base para sobrescrita (polimorfismo)
    public String descrever() {
        return "Usuário: " + nome + " | Email: " + email + " | Telefone: " + telefone;
    }
}

