import java.util.ArrayList;

public class SistemaDelivery {
    private final ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pedido criarPedido(Cliente c, Restaurante r, double valor) {
        Pedido p = new Pedido();
        p.cliente = c;
        p.restaurante = r;
        p.valorTotal = valor;

        pedidos.add(p);
        return p;
    }

    public void listarPedidos() {
        System.out.println("=== PEDIDOS CADASTRADOS ===");

        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }

        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("#" + (i + 1));
            System.out.println(pedidos.get(i).toString());
        }
    }
}

