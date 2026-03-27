package br.com.seuprojeto.model;

public class Restaurante {
    private String nome;
    private String endereco;
    private String categoria; // Ex: Pizza, Lanches, Japonesa

    public Restaurante(String nome, String endereco, String categoria) {
        setNome(nome);
        setEndereco(endereco);
        setCategoria(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do restaurante não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço do restaurante não pode ser vazio.");
        }
        this.endereco = endereco.trim();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("Categoria do restaurante não pode ser vazia.");
        }
        this.categoria = categoria.trim();
    }

    public void exibirDados() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Restaurante {"
                + "\n  Nome: " + nome
                + "\n  Endereço: " + endereco
                + "\n  Categoria: " + categoria
                + "\n}";
    }
}

