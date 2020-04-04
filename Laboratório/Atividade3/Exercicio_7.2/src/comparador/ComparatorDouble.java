package comparador;

import java.util.Comparator;

public class ComparatorDouble implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		Double d1decimal = d1 - Math.floor(d1); 
		Double d2decimal = d2 - Math.floor(d2);
		return d1decimal.compareTo(d2decimal); 
	}
}
