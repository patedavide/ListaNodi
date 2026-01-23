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

        String valore = this.cursor.getValore();
        this.cursor = this.cursor.getNext();
        return valore;
    }

    public void inserimentoNodo(String valore, int indice){
        if(indice <0 || indice > this.size){
            System.out.println("Indice non valido");
        }

        Nodo nuovoNodo = new Nodo(valore);

        if(indice == 0){
            nuovoNodo.setNext(this.head);
            this.head = nuovoNodo;
        } else {
            Nodo temp = this.head;
            for(int i=0; i<indice-1; i++){
                temp = temp.getNext();
            }
            nuovoNodo.setNext(temp.getNext());
            temp.setNext(nuovoNodo);
        }
        this.size++;

    }

    public int ricercaNodo(String valore){
        Nodo temp = this.head;
        int indice = 0;

        while(temp != null){
            if(temp.getValore().equals(valore)){
                return indice;
            }
            temp = temp.getNext();
            indice++;
        }
        return -1;
    }

    public void eliminaNodo(int indice){
        if( indice<0 || indice >= this.size){
            System.out.println("Indice non valido");
        }

        if(indice == 0){
            this.head = this.head.getNext();
        } else {
            Nodo temp = this.head;
            for(int i=0; i<indice-1; i++){
                temp = temp.getNext();
            }
            temp.setNext( temp.getNext().getNext() );
        }
        this.size--;
        if(this.size == 0) {
            this.cursor = null;
        }

    }

    public void eliminaTuttiValori(String valore) {
        while (this.head != null && this.head.getValore().equals(valore)) {
            this.head = this.head.getNext();
            this.size--;
        }

        if (this.head == null) {
            this.cursor = null;
            return;
        }

        Nodo temp = this.head;
        while (temp.getNext() != null) {
            if (temp.getNext().getValore().equals(valore)) {
                temp.setNext(temp.getNext().getNext());
                this.size--;
            } else {
                temp = temp.getNext();
            }
        }
    }


    public String toString(){
        return "Liste [size=" + size + ", head=" + head + ", cursor=" + cursor + "]";
    }
}
