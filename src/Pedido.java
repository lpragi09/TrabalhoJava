public class Pedido {
    // Referências (associações)
    public Cliente cliente;
    public Restaurante restaurante;
    public double valorTotal;

    public void exibirDados() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String nomeCliente = (cliente != null && cliente.nome != null) ? cliente.nome : "N/A";
        String nomeRestaurante = (restaurante != null && restaurante.nome != null) ? restaurante.nome : "N/A";
        String categoriaRestaurante = (restaurante != null && restaurante.categoria != null) ? restaurante.categoria : "N/A";

        return "Pedido {" +
                "\n  Cliente: " + nomeCliente +
                "\n  Restaurante: " + nomeRestaurante + " (" + categoriaRestaurante + ")" +
                "\n  Valor Total: R$ " + String.format("%.2f", valorTotal) +
                "\n}";
    }
}

