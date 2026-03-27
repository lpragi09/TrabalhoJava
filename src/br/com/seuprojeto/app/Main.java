package br.com.seuprojeto.app;

import br.com.seuprojeto.model.Cliente;
import br.com.seuprojeto.model.Entregador;
import br.com.seuprojeto.model.Pedido;
import br.com.seuprojeto.model.Restaurante;
import br.com.seuprojeto.model.Usuario;
import br.com.seuprojeto.service.EntregaBicicleta;
import br.com.seuprojeto.service.EntregaMoto;
import br.com.seuprojeto.service.Entregavel;
import br.com.seuprojeto.service.SistemaDelivery;

public class Main {
    public static void main(String[] args) {
        // ==== Entrega 5: abstração, desacoplamento e polimorfismo ====

        Restaurante r1 = new Restaurante(
                "Pizzaria Bella Massa",
                "Rua das Flores, 123 - Centro",
                "Pizza"
        );

        Restaurante r2 = new Restaurante(
                "Sushi do Bairro",
                "Av. Principal, 987 - Jardim",
                "Japonesa"
        );

        Cliente c1 = new Cliente("Ana Souza", "ana@exemplo.com", "(11) 99999-1111");
        Cliente c2 = new Cliente("Bruno Lima", "bruno@exemplo.com", "(11) 98888-2222");

        // Usuário agora é abstrato: apenas Cliente e Entregador podem ser instanciados.
        Entregador e1 = new Entregador("Carlos Motta", "carlos@exemplo.com", "(11) 97777-3333", "Moto");
        Entregador e2 = new Entregador("Daniela Rocha", "daniela@exemplo.com", "(11) 96666-4444", "Bicicleta");

        Usuario[] usuarios = new Usuario[] { c1, c2, e1, e2 };
        System.out.println("=== USUÁRIOS (POLIMORFISMO) ===");
        for (Usuario u : usuarios) {
            System.out.println(u.descrever());
        }
        System.out.println();

        // Instancia pedidos e associa uma estratégia (Entregavel) a cada pedido.
        SistemaDelivery sistema = new SistemaDelivery();
        Pedido pedidoMoto = sistema.criarPedido(c1, r1, 79.90, new EntregaMoto());
        Pedido pedidoBicicleta = sistema.criarPedido(c2, r2, 112.50, new EntregaBicicleta());

        // Usando referência da interface para executar sem saber qual estratégia é.
        Entregavel entrega1 = pedidoMoto.getEntregavel();
        Entregavel entrega2 = pedidoBicicleta.getEntregavel();

        System.out.println("=== REALIZANDO ENTREGAS (POLIMORFISMO) ===");
        entrega1.realizarEntrega();
        entrega2.realizarEntrega();
        System.out.println();

        sistema.listarPedidos();
    }
}

