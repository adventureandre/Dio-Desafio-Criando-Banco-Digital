
public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(150);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        //Intancia do Banco
        Banco banco = new Banco("Pan");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        banco.getContas();

        //Cobra taxa
        banco.cobrarTaxas(0.50);

        //Verifica contas negativas
        banco.verificarContasNegativas();
    }

}
