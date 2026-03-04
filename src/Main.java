public class Main {
    public static void main(String[] args) {
        // ==== ENTREGA 4 (SEMANA 4): HERANÇA E POLIMORFISMO ====
        // 1) Criar pelo menos dois Clientes e dois Entregadores
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

        Entregador e1 = new Entregador("Carlos Motta", "carlos@exemplo.com", "(11) 97777-3333", "Moto");
        Entregador e2 = new Entregador("Daniela Rocha", "daniela@exemplo.com", "(11) 96666-4444", "Bicicleta");

        // 2) Armazenar em variáveis genéricas do tipo Usuario
        Usuario[] usuarios = new Usuario[]{c1, c2, e1, e2};

        // 3) Chamar o método sobrescrito a partir das variáveis genéricas (SEM if/switch de tipo)
        System.out.println("=== USUÁRIOS (POLIMORFISMO) ===");
        for (Usuario u : usuarios) {
            System.out.println(u.descrever());
        }
        System.out.println();

        // ==== ENTREGA 3/2: FLUXO DO DELIVERY CONTINUA FUNCIONANDO ====
        SistemaDelivery sistema = new SistemaDelivery();
        sistema.criarPedido(c1, r1, 79.90);
        sistema.criarPedido(c2, r2, 112.50);

        // (Opcional) Testar validações: tentar criar/alterar dados inválidos
        try {
            sistema.criarPedido(c1, r1, -10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Falha esperada ao criar pedido inválido: " + e.getMessage());
        }

        try {
            c1.setNome("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Falha esperada ao alterar cliente inválido: " + e.getMessage());
        }

        // 3) Relatório: exibir os pedidos cadastrados (ID, nomes e valor)
        sistema.listarPedidos();
    }
}

