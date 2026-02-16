public class Restaurante {
    // Atributos (variáveis) - semana 1: acesso direto (sem encapsulamento)
    public String nome;
    public String endereco;
    public String categoria; // Ex: Pizza, Lanches, Japonesa

    // Método para exibir as informações do restaurante no console
    public void exibirDados() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Restaurante {" +
                "\n  Nome: " + nome +
                "\n  Endereço: " + endereco +
                "\n  Categoria: " + categoria +
                "\n}";
    }
}

