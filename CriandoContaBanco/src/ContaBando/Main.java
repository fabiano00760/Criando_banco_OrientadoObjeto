package ContaBando;

public class Main {

	public static void main(String[] args) {
		ContaBanco CC1 = new ContaBanco();
		CC1.setNumConta(1547);
		CC1.setDono("fabiano");
		CC1.abriConta("CC");

		
		ContaBanco CC2 = new ContaBanco();
		CC2.setNumConta(2541);
		CC2.setDono("maria");
		CC2.abriConta("Cpp");
		
		CC1.depositar(100);
		CC2.depositar(500);
		CC2.sacar(15000);

		CC2.estadoAtual();
		CC1.estadoAtual();

	}

}
