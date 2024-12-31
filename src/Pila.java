import java.util.Stack;
/*3.Pila e Stack*/
public class Pila {
    public static void main(String[] args){
        Stack<String> pila = new Stack<>();

        /*Aggiungi elementi alla Pila*/
        pila.push("Primo");
        pila.push("Secondo");
        pila.push("Terzo");

        /*Stampa la Pila*/
        System.out.println("Il contenuto della Pila: " + pila);

        /*Rimuovi e ristama l'elemento in cima*/
        String elemento = pila.pop();
        System.out.println("Elemento rimosso: " + elemento);

        /*Stampa la pila aggiornata*/
        System.out.println("Il contenuto della Pila dopo il 'pop': " + pila);
    }
}
