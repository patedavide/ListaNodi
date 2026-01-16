public class Liste {
    private int size;
    private Nodo head;
    private Nodo cursor;

    public Liste(){
        this.size = 0;
        this.head = null;
        this.cursor = null;
    }

    public int getSize() {
        return size;
    }
    public Nodo getHead() {
        return head;
    }
    public Nodo getCursor() {
        return cursor;
    }
    public void setCursor(Nodo cursor) {
        this.cursor = cursor;
    }

    public void accodaNodo(String valore){
        Nodo nuovoNodo = new Nodo(valore);
        if(this.head == null){
            this.head = nuovoNodo;
            this.cursor = this.head;
        } else {
            Nodo temp = this.head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(nuovoNodo);
        }
        this.size++;
    }

    public String leggiNodo(int indice){
        if(indice <0 || indice >= this.size){
            System.out.println("Indice non valido");
        }

        Nodo temp = this.head;
        for(int i=0; i<indice;i++){
            temp = temp.getNext();

        }

        return temp.getValore();
    }

    public String visitaNodo(){
        if(this.cursor == null){
            return null;
        }
        return this.cursor.getValore();
    }
}
