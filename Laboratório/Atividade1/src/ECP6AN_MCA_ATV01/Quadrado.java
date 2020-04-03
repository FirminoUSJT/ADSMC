package ECP6AN_MCA_ATV01;

public class Quadrado extends Poligono implements Diagonal{
	
	
	public Quadrado(double base) {
		
	super.base = base;
		
	}
	
	@Override
	public double area() {
		return Math.pow(base,2);
	}

	@Override
	public double diagonal() {
		return base*Math.sqrt(2);
	}
	
	@Override
	public double perimetro() {
		return base*4;
	}
	
	@Override
	public String toString() {
		
		return "Quadrado\n" + " Área: " + area() + "\nDiagonal: " + diagonal() + "\nPerimetro: " + perimetro();
	}


}