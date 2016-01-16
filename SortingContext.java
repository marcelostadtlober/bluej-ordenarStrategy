
/**
 * Escreva a descrição da classe SortingContext aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class SortingContext
{
    private SortInterface ordenador = null;
    
    public void sortInt(int[] lista) {
        ordenador.ordenar(lista);
    }
    
    public SortInterface getOrdenador() {
        return this.ordenador;
    }
    
    public void setOrdenador(SortInterface ordenador) {
        this.ordenador = ordenador;
    }
}
