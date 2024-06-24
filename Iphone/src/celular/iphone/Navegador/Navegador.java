package celular.iphone.Navegador;

public class Navegador implements NavegadorInternet{

	public void ExibirPagina() {
		System.out.println("Exibindo a página");
	}

	public void AdiconarAba() {
		System.out.println("Adicionando Aba");
	}

	public void AtualizarPagina() {
		System.out.println("Atualizando página");
		ExibirPagina();
	}

}
