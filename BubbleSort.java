
/**
 * Escreva a descrição da classe BubbleSort aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class BubbleSort implements SortInterface
{
    // implementaçao do BubbleSort
    public void ordenar(int[] lista) {        
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
        for(int i = 0; i < lista.length - 1; i++) {
            // Variavel utilizada para controlar se a lista já está ordenada.
            boolean estaOrdenada = true;
            //for utilizado para ordenar a lista.
            for(int j=0; j < lista.length - 1 - i; j++) {
                /* Se o valor da posição atual da lista for maior que o próximo valor,
                 * então troca os valores de lugar na lista */
                if(lista[j] > lista[j + 1]) {
                    int aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                    estaOrdenada = false;
                }
            }
            // Se a lista está ordenada, então para as interações sobre ela.
            if(estaOrdenada)
                break;
        }
    }
}
