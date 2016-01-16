
/**
 * Escreva a descrição da classe SortingClient aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
import java.util.Random;

public class SortingClient
{
	private static SortingContext context = new SortingContext();
	private static int[] lista;
	
    private static void preencherLista() {
    	int t = 0;
    	
    	// Ler o tamanho da Lista
    	try {
    		System.out.println("Informe o tamanho da lista");
    		t = new Scanner(System.in).nextInt();
    		
    		if(t < 1) {
    			throw new Exception();
    		}
    	} catch (Exception ex) {
    		System.err.println("Tamanho de Vetor inválido! Encerrando a aplicação...");
    		System.exit(-1);
    	}
    	
    	// Gerando randomicamente valores da Lista
    	Random gen = new Random();
    	lista = new int[t];
    	for(int i = 0; i < t; i++) {
    		lista[i] = gen.nextInt(100);
    	}
    }
    
    private static void exibeLista(int[] lista) {
    	for(int i : lista) {
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }

	public static void main(String[] args) {
		int alg = 0;
		try {
			System.out.println("Escolha um algoritmo de ordenação");
			System.out.println("1- QuickSort");
	        System.out.println("2- MergeSort");
	        System.out.println("3- HeapSort");
	        System.out.println("4- BubbleSort");
	        alg = new Scanner(System.in).nextInt();
	        
	        switch (alg) {
	            case 1:
	                context.setOrdenador(new QuickSort());
	                break;
	            case 2:
	                context.setOrdenador(new MergeSort());
	                break;
	            case 3:
	                context.setOrdenador(new HeapSort());
	                break;
	            case 4:
	                context.setOrdenador(new BubbleSort());
	                break;
	            default:
	            	throw new Exception();
	        }
	        
	        // Gera radomicamente a Lista
	        preencherLista();
	        
	        // Exibe a Lista gerada
	        System.out.println("Lista gerada:");
	        exibeLista(lista);
	        
	        // Chamada ao Comportamento Ordenador selecionado
	        context.sortInt(lista);
	        
	        //  Exibe a Lista ordenada
	        System.out.println("\nLista ordenada:");
	        exibeLista(lista);
	        
		} catch (Exception ex) {
			System.err.println("Opções inválidas! Encerrando a aplicação...");
			System.exit(-1);
		}
    }
}
