package aulaOO2;

public class TestaContaCliente {
	public static void main(String[] args) {
		ContaTransf2 c2 = new ContaTransf2("Joao", "123.456.789-20");
//		Cliente cliente1 = new Cliente();
//		c2.cliente = cliente1;
//		c2.cliente.nome = "Joao";
		System.out.println(c2.cliente.nome);
//		int contador = c2.getContadorDeContas();
		System.out.println(ContaTransf2.getContadorDeContas());
		
		ContaTransf2 c1 = new ContaTransf2("Maria", "123.456.789-20");
		System.out.println(ContaTransf2.getContadorDeContas());
	}
}
