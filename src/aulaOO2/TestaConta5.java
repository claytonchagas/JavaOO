package aulaOO2;

public class TestaConta5 {
public static void main(String[] args) {
	Conta c1 = new Conta();
	c1.nome = "Joao";
	
	Conta c2 = new Conta();
	c2.nome = "Joao";
	
	if (c1 == c2) {
		System.out.println("as contas sao iguais");
	} else {
		System.out.println("as contas sao diferentes");
	}
	
}
}
