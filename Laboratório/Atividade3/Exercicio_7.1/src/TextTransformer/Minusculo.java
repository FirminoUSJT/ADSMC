package TextTransformer;

public class Minusculo extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		System.out.println("Texto em Maiusculo: " + texto.toUpperCase());
	}

}
