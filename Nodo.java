public class Nodo {

    private String valore;
    private Nodo next;

    public Nodo(String valore){
        this.valore = valore;
        this.next = null;
    }

    public String getValore() {
        return valore;
    }
    public void setValore(String valore) {
        this.valore = valore;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }

    public String toString(){
        return "Nodo[valore: " + valore + "next: " + next +"]";
    }

}
