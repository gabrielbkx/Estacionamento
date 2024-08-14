package entities;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private String nome;
    private String endereco;
    private List<Veiculo> veiculosEstacionados = new ArrayList<>();

    public Estacionamento() {
    }

    public Estacionamento(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculosEstacionados.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        this.veiculosEstacionados.remove(veiculo);
    }

    public List<Veiculo> listarVeiculos(){
        return veiculosEstacionados;
    }

}
