package patterns.comportamiento.chainOfResponsibility;

public abstract class Manejador {

    protected Manejador siguienteManejador;

    public Manejador getSiguiente() {
        return this.siguienteManejador;
    }

    public void setSiguiente(Manejador m) {
        this.siguienteManejador = m;
    }

    public abstract void comprobar(String estado);
}
