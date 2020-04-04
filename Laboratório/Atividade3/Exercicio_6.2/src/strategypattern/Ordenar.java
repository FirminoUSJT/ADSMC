package strategypattern;

import java.util.Arrays;

public void Ordenar(int v[]) {
	int p;
	int contador = 0;
	for (int i0; i< v.lenght; i++) {
		contador++;} 
	p = 0;
	QuickSort(v, p, contador -1);
	System.out.println ("QuickSort: " +Arrays.toString(v));
}
