package br.com.seuprojeto.model;

public class Cliente extends Usuario {
    public Cliente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String descrever() {
        return "Cliente: " + getNome() + " | Email: " + getEmail() + " | Telefone: " + getTelefone();
    }
}

