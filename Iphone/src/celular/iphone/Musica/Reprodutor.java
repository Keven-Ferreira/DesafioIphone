package celular.iphone.Musica;

public class Reprodutor implements ReprodutorMusical{

	public void Tocar() {
		System.out.println("Tocando a música");
		
	}

	@Override
	public void Selecionar() {
		System.out.println("Lendo a musica selecionada");
		Tocar();
	}

	@Override
	public void Pausar() {
		System.out.println("pausando a musica");
		
	}
}
