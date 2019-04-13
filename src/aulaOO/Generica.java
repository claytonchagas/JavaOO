package aulaOO;

public class Generica {
	public static void main(String[] args) {
		Veiculo2 v2 = new Veiculo2();
		Veiculo3 v3 = new Veiculo3();
		v2.velocidade = 10;
		v3.velocidade = 20;
		mostraVelocidade(v2);
		mostraVelocidade(v3);
	}
	
	public static void mostraVelocidade(Veiculo veiculo) {
		System.out.println(veiculo.velocidade);
	}
}
