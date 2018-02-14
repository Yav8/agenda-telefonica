import java.util.HashMap;

/**
 * Clase AgendaTelefonica que almacena números de 
 * diferentes contactos.
 */
public class AgendaTelefonica {
    private HashMap<String, String> agenda;
    
    /**
     * Constructor de objetos de la clase AgendaTelefonica.
     */
    public AgendaTelefonica() {
        agenda = new HashMap<>();
    }
    
    /**
     * Introduce el número de un contacto.
     */
    public void enterNumber(String name, String number) {
        agenda.put(name, number);
    }
    
    /**
     * Devuelve el número de un contacto.
     */
    public String lookupNumber(String name) {
        return agenda.get(name);
    }
    
    /**
     * Imprime todas las claves.
     */
    public void printAllNames() {
        System.out.println(agenda.keySet());
    }
}