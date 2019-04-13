package aulaOO2;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
	boolean sacar(double valor) {
		if ((this.saldo+this.limite) < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
//		double saldoAlterado = saldo - valor;
//		saldo = saldoAlterado;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
}