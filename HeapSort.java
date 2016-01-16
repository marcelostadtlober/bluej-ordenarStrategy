
/**
 * Escreva a descrição da classe HeapSort aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class HeapSort implements SortInterface
{
	// Implementação do HeapSort
	public void ordenar(int[] lista) {
		controiMaxHeap(lista);
		int n = lista.length;
		
		for(int i = lista.length - 1; i > 0; i--) {
			swap(lista, i, 0);
			maxHeapify(lista, 0, --n);
		}
	}
	
	private void controiMaxHeap(int[] lista) {
		for(int i = lista.length/2 - 1; i >= 0; i--)
			maxHeapify(lista, i, lista.length);
	}
	
	private void maxHeapify(int[] lista, int pos, int n) {
		int max;
		int l = 2 * pos + 1;
		int dir = 2 * pos + 2;
		
		if((l < n) && (lista[l] > lista[pos])) {
			max = l;
		} else {
			max = pos;
		}
		
		if((dir < n) && (lista[dir] > lista[max])) {
			max = dir;
		}
		
		if(max != pos) {
			swap(lista, pos, max);
			maxHeapify(lista, max, n);
		}
	}
	
	public void swap(int[] lista, int j, int aposJ) {
		int aux = lista[j];
		lista[j] = lista[aposJ];
		lista[aposJ] = aux;
	}
}
