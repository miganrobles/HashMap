
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    // Almacena las claves de nuestro HashMap
    private String[] claves;
    // Almacena los elementos de nuestro HashMap
    private int[] valores;
   
    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        // initialise instance variables
        claves = new String[0];
        valores = new int[0];
    }
    
    /**
     * Vacía el mapa
     */
    public void clear() 
    {
        claves = new String[0];
        valores = new int[0];
    }
    
    /**
     * Devuelve el número de elementos del mapa
     */
    public int size()
    {
        return claves.length;
    }
    
    /**
     * Devuelve true si el mapa contiene la clave dada
     */
    public boolean containsKey(String clave)
    {
        boolean val = false;
        int index = 0;
        while (index < claves.length && !val) {
            if (claves[index].equals(clave)) {
                val = true;
            }
            index++;
        }
        return val;
    }
    
    /**
     * Devuelve true si el mapa contiene el valor dado.
     */
    public boolean containsValue(int valor)
    {
        boolean val = false;
        int index = 0;
        while (index < valores.length && !val) {
            if (valores[index] == valor) {
                val = true;
            }
            index++;
        }
        return val;
    }
}
