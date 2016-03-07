
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
     * Devuelve true si el mapa contiene la clave dada
     */
    public boolean containsKey(String clave)
    {
        boolean valor = false;
        int index = 0;
        while (index < claves.length && !valor) {
            if (claves[index].equals(clave)) {
                valor = true;
            }
        }
        return valor;
    }
}
