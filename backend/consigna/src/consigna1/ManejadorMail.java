package consigna1;

public abstract class ManejadorMail {
    private ManejadorMail siguiente;

    public ManejadorMail getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ManejadorMail siguiente) {
        this.siguiente = siguiente;
    }

  public abstract String comprobarMail(Mail mail);
}
