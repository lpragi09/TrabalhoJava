public class Main {
    public static void main(String[] args) {
        // 1) Instanciar: pelo menos dois restaurantes e dois clientes
        Restaurante r1 = new Restaurante();
        Restaurante r2 = new Restaurante();

        // Restaurantes
        r1.nome = "Pizzaria Bella Massa";
        r1.endereco = "Rua das Flores, 123 - Centro";
        r1.categoria = "Pizza";

        r2.nome = "Sushi do Bairro";
        r2.endereco = "Av. Principal, 987 - Jardim";
        r2.categoria = "Japonesa";

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        // Clientes
        c1.nome = "Ana Souza";
        c1.telefone = "(11) 99999-1111";

        c2.nome = "Bruno Lima";
        c2.telefone = "(11) 98888-2222";

        // 2) Processar: criar pedidos associando clientes e restaurantes
        SistemaDelivery sistema = new SistemaDelivery();
        sistema.criarPedido(c1, r1, 79.90);
        sistema.criarPedido(c2, r2, 112.50);

        // 3) Relatório: listar pedidos cadastrados
        sistema.listarPedidos();
    }
}

