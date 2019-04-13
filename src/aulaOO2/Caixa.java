package aulaOO2;

public class Caixa extends Funcionario {
	int senha;

	double getBonus() {
		return super.getBonus() + 10000;
	}

	public boolean verificaSenha(int senha) {
		return false;
		//logica diferente de gerente
	}
}