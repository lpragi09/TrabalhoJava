package br.com.seuprojeto.model;

import br.com.seuprojeto.service.Entregavel;

public class Pedido {
    private static int proximoId = 1;

    private final int id;
    private final Cliente cliente;
    private final Restaurante restaurante;
    private double valorTotal;
    private final Entregavel entregavel;

    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal, Entregavel entregavel) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente do pedido não pode ser nulo.");
        }
        if (restaurante == null) {
            throw new IllegalArgumentException("Restaurante do pedido não pode ser nulo.");
        }
        if (entregavel == null) {
            throw new IllegalArgumentException("Estratégia de entrega do pedido não pode ser nula.");
        }
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor total do pedido não pode ser negativo.");
        }

        this.id = proximoId++;
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.valorTotal = valorTotal;
        this.entregavel = entregavel;
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

    public Entregavel getEntregavel() {
        return entregavel;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Valor total do pedido não pode ser negativo.");
        }
        this.valorTotal = valorTotal;
    }

    public void exibirDados() {
        System.out.println(this.toString());
    }

    // Execução da estratégia de entrega (polimorfismo)
    public void realizarEntrega() {
        this.entregavel.realizarEntrega();
    }

    @Override
    public String toString() {
        String nomeCliente = cliente.getNome();
        String nomeRestaurante = restaurante.getNome();
        String categoriaRestaurante = restaurante.getCategoria();

        return "Pedido {"
                + "\n  ID: " + id
                + "\n  Cliente: " + nomeCliente
                + "\n  Restaurante: " + nomeRestaurante + " (" + categoriaRestaurante + ")"
                + "\n  Valor Total: R$ " + String.format("%.2f", valorTotal)
                + "\n}";
    }
}

