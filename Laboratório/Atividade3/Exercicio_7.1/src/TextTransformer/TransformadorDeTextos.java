package TextTransformer;

public abstract class TransformadorDeTextos {
	
	public final void run(String texto) {
		transformar(texto);
		
	}

	protected abstract void transformar(String texto); 



}
