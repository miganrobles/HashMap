
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
     * Asocia el valor especificado con la clave especificada. Si la clave existía, entonces sobreescribe su valor y devuelve el valor antiguo. 
     * Si no existía devuelve -1.
     */
    public int put(String clave, int valor)
    {
        int val = -1;
        if (containsKey(clave)) {
            int index = 0;
            while (index < claves.length && val == -1) {
                if (claves[index].equals(clave)) {
                    val = valores[index];
                }
                index++;
            }
            valores[index - 1] = valor;        
        }
        else {
            int valores2[] = valores;
            String claves2[] = claves;
            claves = new String[claves.length + 1];
            valores = new int[valores.length + 1];
            for (int index = 0; index < valores2.length; index++) {
                valores[index] = valores2[index];
                claves[index] = claves2[index];
            }
            claves[claves.length - 1] = clave;
            valores[valores.length - 1] = valor;
        }
        return val;
    }

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave)
    {
        int val = -1;
        int index = 0;
        while (index < claves.length && (val == -1)) {
            if (claves[index] == clave) {
                val = valores[index];
            }
            index++;
        }
        return val;
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
     * Devuelve true si el mapa no contiene elementos
     */
    public boolean isEmpty()
    {
        return claves.length == 0;
    }

    /**
     * Devuelve el número de elementos del mapa
     */
    public int size()
    {
        return claves.length;
    }

    /**
     * Elimina del mapa el elemento con la clave dada y devuelve su valor. Si no hay esa clave en el mapa devuelve -1.
     */
    public int remove(String clave)
    {
        int valor = -1;
        if (containsKey(clave)) {
            int valores2[] = valores;
            String claves2[] = claves;
            claves = new String[claves.length - 1];
            valores = new int[valores.length - 1];
            int indice1 = 0;
            for (int indice = 0; indice < claves2.length; indice++) {
                String key = claves2[indice];
                if (!(key.equals(clave))) {
                    claves[indice1] = claves2[indice];
                    valores[indice1] = valores2[indice];
                    indice1++;
                }
                else {
                    valor = valores2[indice];
                }
            }
        }
        return valor;
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
