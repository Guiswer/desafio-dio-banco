package pacote;

public class Main {

    public static void main(String[] args) {

        Cliente guiswer = new Cliente();
        Cliente gautama = new Cliente();

        guiswer.setNome("Guiswer");
        gautama.setNome("Gautama");

        Conta cc = new ContaCorrente(guiswer);
        Conta cp = new ContaPoupanca(gautama);

        Banco banco = new Banco();

        // ações
        cc.depositar(200);
        cc.transferir(100, cp);

        // impressões
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.adicionaConta(cc);
        banco.adicionaConta(cp);

        banco.mostrarContas();
    }
}