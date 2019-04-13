package aulaOO2;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Clayton";
		f1.salario = 1000;
		f1.status = "Professor";
		System.out.println(f1.salario);
		
//		f1.calculoBonificacao(50);
		System.out.println(f1.salario);
	}
}