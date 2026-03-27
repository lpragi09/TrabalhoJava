package br.com.seuprojeto.service;

import br.com.seuprojeto.model.Cliente;
import br.com.seuprojeto.model.Pedido;
import br.com.seuprojeto.model.Restaurante;

import java.util.ArrayList;

public class SistemaDelivery {
    private final ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pedido criarPedido(Cliente cliente, Restaurante restaurante, double valorTotal, Entregavel entregavel) {
        Pedido p = new Pedido(cliente, restaurante, valorTotal, entregavel);
        pedidos.add(p);
        return p;
    }

    public void listarPedidos() {
        System.out.println("=== PEDIDOS CADASTRADOS ===");

        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }

        for (Pedido p : pedidos) {
            System.out.println(
                    "Pedido #" + p.getId() +
                            " | Cliente: " + p.getCliente().getNome() +
                            " | Restaurante: " + p.getRestaurante().getNome() +
                            " | Valor Total: R$ " + String.format("%.2f", p.getValorTotal())
            );
        }
    }
}

