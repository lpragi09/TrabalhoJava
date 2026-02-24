public class Main {
    public static void main(String[] args) {
        // 1) Criar objetos utilizando os novos construtores (nascem válidos)
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

        Cliente c1 = new Cliente("Ana Souza", "(11) 99999-1111");
        Cliente c2 = new Cliente("Bruno Lima", "(11) 98888-2222");

        // 2) Processar: utilizar o SistemaDelivery para criar pedidos
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

