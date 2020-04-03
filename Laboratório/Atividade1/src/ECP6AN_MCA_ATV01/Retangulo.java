package ECP6AN_MCA_ATV01;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
		
		super.base = base;
		super.altura = altura;
	}	
	
	@Override
	public double area() {
		return base*altura;
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
	}

	@Override
	public double perimetro() {
		return (2*base)+(2*altura);
	}
	
	@Override
	public String toString() {
		
		return "Retangulo\n" + " Área: " + area() + "\nDiagonal: " + diagonal() + "\nPerimetro: " + perimetro();
	}

}


