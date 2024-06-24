package celular.iphone;

import celular.iphone.Musica.ReprodutorMusical;
import celular.iphone.Navegador.NavegadorInternet;
import celular.iphone.Telefone.Ligacao;

public class Iphone implements ReprodutorMusical, NavegadorInternet, Ligacao{
	
	//Reprodutor Muical
	public void Tocar() {
		System.out.println("Tocando via Iphone");
	}
	
	public void Selecionar() {
		System.out.println("Selecionando a música via Iphone");
		Tocar();
	}

	public void Pausar() {
		System.out.println("pausando a música via Iphone");	
	}
	
	//Telefone
	
	public void IniciarCorreioDeVoz() {
		System.out.println("Atendendo via Iphone");
	}
	
	public void ReceberChamada() {
		System.out.println("Recebendo Chamada via Iphone");
	}
	
	public void FazerChamada() {
		System.out.println("Fazendo chamada via Iphone");
	}
	
	//Navegador
	public void ExibirPagina() {
		System.out.println("Exibindo a página no Iphone");
	}

	public void AdiconarAba() {
		System.out.println("Adicionando Aba no Iphone");
	}

	public void AtualizarPagina() {
		System.out.println("Atualizando página no Iphone");
		ExibirPagina();
	}

}
