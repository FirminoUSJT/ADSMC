package ECP6AN_MCA_ATV01;

public  class Cilindro extends Solido {
	private double raio;
   private double altura;

	public Cilindro(double raio, double altura) {
		this.raio = raio;
      this.altura = altura;
	
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio =raio;
	}
   
   public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
   
       
   
   @Override
   public double volume (){
   return (Math.pow(getRaio(),3)* Math.PI)*getAltura();
   }

	
	@Override
	public String toString() {
		return "Cilindro [Raio= " + getRaio() +"Altura= "+getAltura()+ "]";
	}

}