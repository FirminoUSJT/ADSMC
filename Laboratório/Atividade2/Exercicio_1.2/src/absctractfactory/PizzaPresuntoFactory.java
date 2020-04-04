package absctractfactory;

  
public class PizzaPresuntoFactory extends PizzaFactory {


	@Override
	public Sabor montarPizza() {
		// TODO Auto-generated method stub
		return new Presunto();
	}

	@Override
	public Pizzaiolo SelecionaPizzaiolo() {
		// TODO Auto-generated method stub
		return new Pizzaiolo2();
	}

}
