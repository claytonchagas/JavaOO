package aulaOO2;

public class TestaControleBonus {
	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();

		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		controle.setTotalBonus(f1);
		System.out.println(controle.getTotalBonus());

		DBA d1 = new DBA();
		d1.setSalario(1000);
		controle.setTotalBonus(d1);
		System.out.println(controle.getTotalBonus());
	}
}