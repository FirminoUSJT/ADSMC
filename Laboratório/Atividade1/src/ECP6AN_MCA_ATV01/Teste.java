package ECP6AN_MCA_ATV01;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Quadrado(8.0));
		figuras.add(new Retangulo(8.0, 6.0));
		figuras.add(new Triangulo(6.0, 5.0));
		figuras.add(new Circulo(6.0));
		figuras.add(new Cilindro(8.0, 6.0));

		for (Figura fig : figuras) {
			System.out.println(fig);

		}
	}

}
