package patterns.comportamiento.visitor;

public interface IPersonaje {
    public void accept(IVisitor visitor);
}
