import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;

class NodeTest {

    @org.junit.Test
    public void insert() {
        Node<Association<String,String>> palabrasNuevas = new Node<>();
        String palabrauno = "hello";
        String palabrados = "hola";
        Association simon = new Association(palabrauno,palabrados);
        palabrasNuevas.insert(simon);
        assertEquals(simon,simon);
    }

    @Test
    public void getValue() {
        Node<Association<String,String>> palabrasNuevas = new Node<>();
        String palabrauno = "hello";
        String palabrados = "hola";
        Association simon = new Association(palabrauno,palabrados);
        String listo = simon.toString();
        Object uno = simon.theKey;
        Object dos =  simon.theValue;
        assertEquals(listo," " + uno + " " + dos);
    }

    @Test
    public void getKey() {
        Node<Association<String,String>> palabrasNuevas = new Node<>();
        String palabrauno = "hello";
        String palabrados = "hola";
        Association simon = new Association(palabrauno,palabrados);
        String listo = simon.toString();
        Object uno = simon.theKey;
        Object dos =  simon.theValue;
        assertEquals(listo," " + uno + " " + dos);
    }
}