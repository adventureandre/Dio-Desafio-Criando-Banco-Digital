import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}



	public void getContas() {
		System.out.println("=== Lista de Contas no Banco: " +this.nome+ " ===");
		System.out.println("Total de contas: " + contas.size());
		System.out.println(contas);
		System.out.println("===============================");
	}


	public void adicionarConta(Conta novaConta) {
		contas.add(novaConta);
	}

	public void cobrarTaxas(double valor) {
		System.out.println("=== Cobrando taxas de todas as contas no Banco: " + this.nome + " ===");
		for (Conta conta : contas) {
			conta.sacar(valor);
			conta.imprimirInfosComuns();
			System.out.println("===============================");
		}
	}

	public void verificarContasNegativas() {
		System.out.println("=== Contas com Saldo Negativo no Banco: " + this.nome + " ===");
		for (Conta conta : contas) {
			if (conta.getSaldo() < 0) {
				conta.imprimirInfosComuns();
				System.out.println("===============================");
			}
		}
	}


}
