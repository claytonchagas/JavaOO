package aulaOO2;

public class TestaControleSalarial {
	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();

		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		controle.setTotalSalarios(f1);
		System.out.println(controle.getTotalSalarios());

		DBA d1 = new DBA();
		d1.setSalario(1000);
		controle.setTotalSalarios(d1);
		System.out.println(controle.getTotalSalarios());
	}
}