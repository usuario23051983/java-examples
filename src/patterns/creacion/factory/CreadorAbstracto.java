package patterns.creacion.factory;

public abstract class CreadorAbstracto {
    public static final int AUDIO = 1;
    public static final int VIDEO = 2;

    public abstract IArchivo crear(int tipo);
}
