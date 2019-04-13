package aulaOO2;

public class Gerente extends Funcionario implements ControleInterno2{
	int senha;

	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso nao autorizado");
			return false;
		}
	}

	@Override
	public boolean verifica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}
}