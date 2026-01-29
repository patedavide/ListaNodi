public class Main {
    public static void main(String[] args) {

        Liste lista = new Liste();

        // accodaNodo
        lista.accodaNodo("Primo");
        lista.accodaNodo("Secondo");
        lista.accodaNodo("Terzo");
        lista.accodaNodo("Secondo");

        System.out.println("\nLista:");
        for(int i = 0; i < lista.getSize(); i++){
            System.out.println("Nodo " + i + ": " + lista.leggiNodo(i));
        }

        lista.inserimentoNodo("Inizio", 0);
        lista.inserimentoNodo("Centro", 2);

        System.out.println("\nLista aggiornata:");
        for(int i = 0; i < lista.getSize(); i++){
            System.out.println("Nodo " + i + ": " + lista.leggiNodo(i));
        }

        int indice = lista.ricercaNodo("Secondo");
        System.out.println("\nIndice primo 'Secondo': " + indice);

        System.out.println("\nVisita nodi con cursore:");
        String valoreNodo;
        while((valoreNodo = lista.visitaNodo()) != null){
            System.out.println("Valore del nodo cursore: " + valoreNodo);
        }

        lista.setCursor(lista.getHead());
        System.out.println("\nCursore al nodo head.");
        System.out.println("Valore del nodo cursore: " + lista.visitaNodo());

        lista.eliminaNodo(1);
        System.out.println("\nLista dopo eliminaNodo(1):");
        for(int i = 0; i < lista.getSize(); i++){
            System.out.println("Nodo " + i + ": " + lista.leggiNodo(i));
        }

        lista.eliminaTuttiValori("Secondo");
        System.out.println("\nLista dopo eliminaTuttiValori(Secondo):");
        for(int i = 0; i < lista.getSize(); i++){
            System.out.println("Nodo " + i + ": " + lista.leggiNodo(i));
        }

        lista.inserimentoOrdinato("A");
        lista.inserimentoOrdinato("M");
        lista.inserimentoOrdinato("D");
        lista.setCursor(lista.getHead());

        System.out.println("\nLista dopo inserimentoOrdinato(A, M, D):");
        for (int i = 0; i < lista.getSize(); i++) {
            System.out.println("Nodo " + i + ": " + lista.leggiNodo(i));
        }

    }
}
