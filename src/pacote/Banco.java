package pacote;

import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionaConta(Conta nome) {
        this.contas.add(nome);
    }

    public void mostrarContas() {
        System.out.println("\nEsses são os clientes: ");
        for (Conta aConta : contas) {
            System.out.println(aConta.cliente.getNome());
        }
    }

    // getters
    public String getNome() {
        return nome;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
}