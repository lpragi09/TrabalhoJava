public class Entregador extends Usuario {
    private String veiculo;

    public Entregador(String nome, String email, String telefone, String veiculo) {
        super(nome, email, telefone);
        setVeiculo(veiculo);
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        if (veiculo == null || veiculo.trim().isEmpty()) {
            throw new IllegalArgumentException("Veículo do entregador não pode ser vazio.");
        }
        this.veiculo = veiculo.trim();
    }

    @Override
    public String descrever() {
        return "Entregador: " + getNome() +
                " | Email: " + getEmail() +
                " | Telefone: " + getTelefone() +
                " | Veículo: " + veiculo;
    }
}

