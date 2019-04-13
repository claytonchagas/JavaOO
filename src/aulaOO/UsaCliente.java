package aulaOO;

public class UsaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Maria");
		Cliente c2 = new Cliente("Joao");
		
		System.out.println(c1.nome);
		System.out.println(c2.nome);
		System.out.println(c1.cidade);
	}
}
