public class Main {
    public static void main(String[] args) {
        // 1) Instanciar: pelo menos dois objetos diferentes do tipo Restaurante
        Restaurante r1 = new Restaurante();
        Restaurante r2 = new Restaurante();

        // 2) Preencher: atribuir valores manualmente aos atributos de cada objeto
        r1.nome = "Pizzaria Bella Massa";
        r1.endereco = "Rua das Flores, 123 - Centro";
        r1.categoria = "Pizza";

        r2.nome = "Sushi do Bairro";
        r2.endereco = "Av. Principal, 987 - Jardim";
        r2.categoria = "Japonesa";

        // 3) Testar: exibir os dados de ambos os restaurantes no console
        r1.exibirDados();
        System.out.println();
        r2.exibirDados();
    }
}

