package aulaOO2;

public class Gerente extends Funcionario {
	double getBonus() {
		return super.getBonus() + 10000;
	}
}