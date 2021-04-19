import java.util.Map;

public class Association <K extends Comparable, V extends Comparable> implements Map.Entry, Comparable {

    // pre: entra un non
    // post: regresa true si el valor es igual

    protected Object theKey; // la clave del par clave-valor
    protected Object theValue; // el valor del par clave-valor
    public Association(K key, V value)
    {
        theKey = key;
        theValue = value;
    }

    public Object getValue()
    {
        return theValue; // retorna el valor de la asosiacion
    }
    public Object getKey()
    {
        return theKey; // retorna la llave de la asociacion
    }
    public Object setValue(Object value)
    {
        Object oldValue = theValue;
        theValue = value; // le asigna el valor de la asociacion a la variable
        return oldValue;

    }
    public Object setKey (Object key){
        Object oldKey = theKey;
        theKey = key;
        return  oldKey;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return
                " " + theKey +
                        " " + theValue ;
    }
}