public class Pedido {
    // Identificador único (static)
    private static int proximoId = 1;

    // Atributos (encapsulados)
    private final int id;
    private final Cliente cliente;
    private final Restaurante restaurante;
    private double valorTotal;

    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente do pedido não pode ser nulo.");
        }
        if (restaurante == null) {
            throw new IllegalArgumentException("Restaurante do pedido não pode ser nulo.");
        }
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor total do pedido não pode ser negativo.");
        }

        this.id = proximoId++;
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    // Faz sentido permitir ajuste do valor (ex: correção). Mantém validação.
    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor total do pedido não pode ser negativo.");
        }
        this.valorTotal = valorTotal;
    }

    public void exibirDados() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String nomeCliente = cliente.getNome();
        String nomeRestaurante = restaurante.getNome();
        String categoriaRestaurante = restaurante.getCategoria();

        return "Pedido {" +
                "\n  ID: " + id +
                "\n  Cliente: " + nomeCliente +
                "\n  Restaurante: " + nomeRestaurante + " (" + categoriaRestaurante + ")" +
                "\n  Valor Total: R$ " + String.format("%.2f", valorTotal) +
                "\n}";
    }
}

