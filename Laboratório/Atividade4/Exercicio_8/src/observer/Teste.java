package observer;


public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Fernando", noticiario);
	noticiario.notificaNoticia("Noticia Nova Disponivel!!!", 1, 2, "Informacao de teste para ver se o programa funciona!");
	new Consumidor("Firmino", noticiario);
	noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Informacao 2 de teste pra ver se o programa esta atualizando!");
	
	
	}
}
