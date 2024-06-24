package Usuário;

import celular.iphone.Iphone;

public class Usuário {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.IniciarCorreioDeVoz();
		iphone.FazerChamada();
		iphone.ReceberChamada();
		iphone.ExibirPagina();
		iphone.AdiconarAba();
		iphone.AtualizarPagina();
		iphone.Tocar();
		iphone.Selecionar();
		iphone.Pausar();
	}
}
