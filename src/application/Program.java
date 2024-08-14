package application;

import entities.Cliente;
import entities.Estacionamento;
import entities.Veiculo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento("Estacionamento wps", "R. Riachuelo, 309 " +
                "- Parque Turf Club, Campos dos Goytacazes - RJ, 28013-450");

        Veiculo veiculo1 =  new Veiculo("LMY-8124","Xre-300","Vermelha");
        Veiculo veiculo2 =  new Veiculo("HTB-2038","gol g6","Branco");
        Veiculo veiculo3 =  new Veiculo("LWK-5162","Corolla","Azul");

        System.out.println("Dados do cliente");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Veículo: ");
        Cliente c1 = new Cliente(nome,cpf,veiculo1);
        estacionamento.adicionarVeiculo(veiculo1);
        estacionamento.adicionarVeiculo();
        System.out.println(estacionamento.listarVeiculos());
        sc.close();
    }
}
