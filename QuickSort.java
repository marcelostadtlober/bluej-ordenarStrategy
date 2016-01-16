
/**
 * Escreva a descrição da classe QuickSort aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class QuickSort implements SortInterface
{
    // implementação do QuickSort
    public void ordenar(int[] lista) {
        ordenar(lista, 0, lista.length - 1);
    }
    
    private void ordenar(int[] lista, int inicio, int fim) {
        if(inicio < fim) {
            int posicaoPivo = separar(lista, inicio, fim);
            ordenar(lista, inicio, posicaoPivo - 1);
            ordenar(lista, posicaoPivo + 1, fim);
        }
    }
    
    private int separar(int[] lista, int inicio, int fim) {
        int pivo = lista[inicio];
        int i = inicio + 1, f = fim;
        while(i <= f) {
            if(lista[i] <= pivo)
                i++;
            else if(pivo < lista[f])
                f--;
            else {
                int troca = lista[i];
                lista[i] = lista[f];
                lista[f] = troca;
                i++;
                f--;
            }
        }
        lista[inicio] = lista[f];
        lista[f] = pivo;
        return f;
    }
}
