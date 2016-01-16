
/**
 * Escreva a descrição da classe MergeSort aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MergeSort implements SortInterface
{
    // Implementação do MergeSort
    public void ordenar(int[] lista) {
        lista = sort(lista);
    }
    
    private int[] sort(int[] lista) {
        if(lista.length <= 1) {
            return lista;
        }
        int meio = lista.length / 2;
        int[] dir = lista.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];
     
        int[] aux = new int[lista.length];
     
        for (int i = 0; i < meio; i++) {
            esq[i] = lista[i];
        }
     
        int auxIndex = 0;
        for (int i = meio; i < lista.length; i++) {
            dir[auxIndex] = lista[i];
            auxIndex++;
        }
     
        esq = sort(esq);
        dir = sort(dir);
     
        aux = mergeSort(esq, dir);
     
        return aux;
    }
    
    private int[] mergeSort(int[] esq, int[] dir) {
        int[] aux = new int[esq.length + dir.length];
     
        int indexDir = 0, indexEsq = 0, indexAux = 0;
     
        while(indexEsq < esq.length || indexDir < dir.length) {
            if(indexEsq < esq.length && indexDir < dir.length) {
                if(esq[indexEsq] <= dir[indexDir]) {
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                } else {
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                }
            } else if(indexEsq < esq.length) {
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
            } else if(indexDir < dir.length) {
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
            }
        }
        return aux;
    }
}
