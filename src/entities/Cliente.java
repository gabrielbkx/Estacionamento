package entities;

public class Cliente {
    private String nome;
    private String cpf;

    private Veiculo veiculo;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Veiculo veiculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome + ", " + cpf + ", " + veiculo;
    }
}
