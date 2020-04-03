package ECP6AN_MCA_ATV01;

public class Triangulo extends Poligono{

	
	private double mn;
	private double np;
	private double pm;
	
	public Triangulo(double base, double altura) {

		super.base = base;
		super.altura = altura;
		double l1 = 0;
		this.mn = l1;
		double l2 = 0;
		this.np = l2;
		double l3 = 0;
		this.pm = l3;
	}	
	
	
	@Override
	public double area() {
		
		return (base*altura)/2;
	}

	@Override
	public double perimetro() {
		
		return (mn + np + pm);
	}
	
	@Override
	public String toString() {
		
		return "Triângulo\n" + " Área: " + area() + "\nPerimetro: " + perimetro();
	}
	

	

}
