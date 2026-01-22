public class Main {
    public static void main(String[] args) {
        Liste lista = new Liste();

        lista.accodaNodo("Primo");
        lista.accodaNodo("Secondo");
        lista.accodaNodo("Terzo");

        System.out.println("Dimensione della lista: " + lista.getSize());

        for(int i=0; i<lista.getSize(); i++){
            System.out.println("Nodo " + i + ": " + lista.leggiNodo(i));
        }

        System.out.println("Valore del nodo corrente (cursore): " + lista.visitaNodo());

    }
}
