package celular.iphone.Telefone;

public class Telefone implements Ligacao{

	@Override
	public void IniciarCorreioDeVoz() {
		System.out.println("Atendendo telefone");
		
	}

	@Override
	public void ReceberChamada() {
		System.out.println("Recebendo Chamada");
		IniciarCorreioDeVoz();
	}
	
	public void FazerChamada() {
		System.out.println("Chamando");
	}
}
