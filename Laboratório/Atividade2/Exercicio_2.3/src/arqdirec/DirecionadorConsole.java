package arqdirec;

public class DirecionadorConsole extends Direcionador{
	
	int i =0;
	@Override
	public void criarLog() {

		for(i = 0; i<=10;i++) {
			System.out.println(i);
		}
		
	}
}
